package test.bean.impl;

import org.springframework.stereotype.Component;
import test.bean.TestInterface;

/**
 * @author : xiongyanjun  Date: 2020/11/13 ProjectName: settleprovisions Version: 1.0
 */
@Component
public class TestImpl2 implements TestInterface {
    @Override
    public void func() {
        System.out.println("this is testImpl2");
    }
}
