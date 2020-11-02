package test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author : xiongyanjun  Date: 2020/10/19 ProjectName: settleprovisions Version: 1.0
 */
@Component
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    Phone phone;

    public void showPhone(){
//        int i = 0;
//        int j = 1;
//        int i1 = j / i;
        System.out.println(name + "has a " +phone.toString());
    }
}
