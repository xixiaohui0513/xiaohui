/**
 * 这节是练习基本变量赋值
 * 变量必须初始化，即为设定的变量赋值
 * int  a;
 * System.out.println(a);   这样运行会报错
 *
 * int a = 2;        为变量a赋值，即初始化
 * System.out.println(a);   这样运行打印才不会报错
 */

public class TestVariable {
    public static void main(String[] args){
        int year = 2022;
        int month = 03;
        int data = 30;
        String  a = "基本变量赋值";
        System.out.println("这节学习时间："+a);
        System.out.println("当前年份："+year);
        System.out.println("当前月份: "+month);
        System.out.println("当前日期: "+data);
    }

}
