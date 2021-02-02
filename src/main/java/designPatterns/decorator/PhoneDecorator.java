package designPatterns.decorator;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public abstract class PhoneDecorator implements Phone{

    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call(String num) {
        phone.call(num);
    }
}
