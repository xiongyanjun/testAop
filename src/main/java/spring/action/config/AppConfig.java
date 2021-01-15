package spring.action.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.action.pojo.AdjustStu;
import spring.action.pojo.impl.Student;

/**
 * @author : xiongyanjun  Date: 2021/1/4 ProjectName: settleprovisions Version: 1.0
 */
@Configuration
public class AppConfig {
    @Bean
    Student getStu(){
        return new Student();
    }

    @Bean
    AdjustStu getAdjustStu(Student student){
        return new AdjustStu(student);
    }
}
