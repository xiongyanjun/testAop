package spring.action.pojo.impl;

import spring.action.pojo.inter.Study;

/**
 * @author : xiongyanjun  Date: 2021/1/4 ProjectName: settleprovisions Version: 1.0
 */
public class Student implements Study {
    @Override
    public void studyEnglish() {
        System.out.println("Studying English...");
    }
}
