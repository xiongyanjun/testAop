package test.aop.service;

import org.springframework.stereotype.Component;

/**
 * @author : xiongyanjun  Date: 2020/8/10 ProjectName: settleprovisions Version: 1.0
 */
@Component(value = "myService")
public class MyServiceImpl implements MyService {
    public String biz() {
        System.out.println("-------------");
        System.out.println("业务逻辑");
//        int i = 1/0;
        System.out.println("-------------");
        return "业务逻辑处理正常";
    }
}
