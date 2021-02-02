package designPatterns.decorator;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public class AIDecorator extends PhoneDecorator{
    public AIDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call(String num) {
        super.call(num);
        System.out.println("AI acts for you to speak.");
    }
}
