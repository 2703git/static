public class MathFunctions {
    static double pi;
    static double e;
    static {
        pi = 3.14159265359;
        e = 2.71828182846;
    }
    public static double circleArea(double radius){
        return pi*radius*radius;
    }
    public static double power(double number){
        return Math.pow(e,number);
    }
    public static double triArea(double a, double b, double c){
        double hp = (a+b+c)/2;
        return Math.sqrt(hp*(hp-a)*(hp-b)*(hp-c));
    }
}
