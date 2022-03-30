/**
 * 本次学习的是通过final将变量变为常量
 * 常量无法再次被赋值
 */

public class TestConstant {

    public static void main(String[] args){
        final double PI = 3.14;/*double是字符类型 */
        //double PI =3.1415;//无法为final后的常量再次赋值
        int r = 3;
        double area = PI*r*r;
        double perimeter = 2*PI*r;
        System.out.println("半径为4的圆面积为： "+area);// ‘+’ 在这里是连接的意思
        System.out.println("半径为4的圆的周长为： "+perimeter);
    }

}
