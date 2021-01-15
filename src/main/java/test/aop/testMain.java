package test.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.bean.Person;

/**
 * @author : xiongyanjun  Date: 2020/8/10 ProjectName: settleprovisions Version: 1.0
 */
public class testMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
        Person person = applicationContext.getBean(Person.class);
        person.showInterface();

    }
}
