package designPatterns.decorator;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        GeneralPhone generalPhone = new GeneralPhone();
        Phone phone = new SmartDecorator(new AIDecorator(generalPhone));
        phone.call("1322255995");
    }
}
