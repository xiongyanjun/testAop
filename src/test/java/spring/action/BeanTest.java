package spring.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.config.AppConfig;
import spring.action.pojo.AdjustStu;

/**
 * @author : xiongyanjun  Date: 2021/1/4 ProjectName: settleprovisions Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BeanTest {

    @Autowired
    AdjustStu adjustStu;

    @Test
    public void testBean(){
        System.out.println(adjustStu);
    }

}
