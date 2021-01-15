package dir.test;

/**
 * @author : xiongyanjun  Date: 2021/1/8 ProjectName: settleprovisions Version: 1.0
 */
public class Hello {
    int num = 0;
    float a = 1.2F;
    double b = 1.2;
    boolean c = true;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.getA()+hello.getB()+hello.getNum());
    }
}
