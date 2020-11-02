package test.aop.service;

import org.springframework.stereotype.Component;

/**
 * @author : xiongyanjun  Date: 2020/8/10 ProjectName: settleprovisions Version: 1.0
 */
@Component(value = "testService")
public class TestServiceImpl implements TestService {
    public void func() {
        System.out.println("TestService Executed");
    }
}
