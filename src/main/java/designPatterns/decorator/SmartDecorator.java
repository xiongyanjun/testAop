package designPatterns.decorator;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public class SmartDecorator extends PhoneDecorator {
    public SmartDecorator(Phone phone) {
        super(phone);
    }
//
    @Override
    public void call(String num) {
        System.out.println("hey,siri");
        super.call(num);
    }
}
