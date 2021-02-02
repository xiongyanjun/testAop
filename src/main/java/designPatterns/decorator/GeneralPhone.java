package designPatterns.decorator;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public class GeneralPhone implements Phone {
    @Override
    public void call(String num) {
        System.out.println("calling "+num+".....");
    }
}
