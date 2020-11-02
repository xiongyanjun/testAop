package test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @author : xiongyanjun  Date: 2020/10/24 ProjectName: settleprovisions Version: 1.0
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.err.println("调用了自定义的BeanFactoryPostProcessor " + beanFactory);
        BeanDefinition bd = beanFactory.getBeanDefinition("phone");
        MutablePropertyValues propertyValues = bd.getPropertyValues();
        List<PropertyValue> propertyValueList = propertyValues.getPropertyValueList();
        for (PropertyValue propertyValue:propertyValueList) {
            if ("brand".equals(propertyValue.getName())){
                TypedStringValue value =(TypedStringValue) propertyValue.getValue();
                value.setValue("HUAWEI");
            }
        }
        System.err.println(bd);

    }
}
