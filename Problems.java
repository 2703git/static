public class Problems {
    static boolean isEven(int number){
        return number%2==0;
    }
    static int max(int a, int b){
        if (a>b){
            return a;
        }
        return b;
    }
    static int square(int number){
        return number*number;
    }
    static double toFahrenheit(double celsius){
        return celsius*9/5+32;
    }
    static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i ==0){
                return false;
            }
        }
        return true;
    }
    static long factorial(int n){
        int pro = 1;
        for (int i = 1; i <= n; i++) {
            pro*=i;
        }
        return pro;
    }
    static int reverse(int number){
        int rev = 0;
        while (number != 0 ){
            int digit = number%10;
            rev = rev*10+digit;
            number = number/10;
        }
        return rev;
    }
    static int countDigits(int number){
        int count = 0;
        while (number != 0){
            number = number/10;
            count++;
        }
        return count;
    }
    static int sumDigits(int number){
        int sum = 0;
        while (number !=0){
            int digit = number%10;
            sum=sum+digit;
            number=number/10;
        }
        return sum;
    }
    static double add(double a, double b){
        return a+b;
    }
    static double subtract(double a, double b){
        return a-b;
    }
    static double multiply(double a, double b){
        return a*b;
    }
    static double divide(double a, double b){
        return  a/b;
    }

}
