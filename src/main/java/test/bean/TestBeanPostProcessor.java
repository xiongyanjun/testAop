package test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : xiongyanjun  Date: 2020/10/26 ProjectName: settleprovisions Version: 1.0
 */
public class TestBeanPostProcessor implements BeanPostProcessor {
    private String name;

    public TestBeanPostProcessor(String name) {
        this.name = name;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof Person){
            // 如果当前的bean是Student,则打印日志
            System.out.println("postProcessBeforeInitialization bean : " + s);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(o instanceof Person){
            Person person = (Person) o;
            person.setName(name);
        }
        return o;
    }
}
