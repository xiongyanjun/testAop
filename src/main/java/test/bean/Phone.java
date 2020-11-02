package test.bean;

/**
 * @author : xiongyanjun  Date: 2020/10/19 ProjectName: settleprovisions Version: 1.0
 */
public class Phone {
    private String price;
    private String brand;

    public Phone() {
    }

    public Phone(String price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
