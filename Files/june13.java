/*public class june13 {

static void printNumbers(int n) {
        if (n == 0) {    
            return;
        }

        System.out.println(n);
        printNumbers(n - 1); 
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}*/  

/*public class june13{

    static void printEven(int n) {
        if (n == 0) {
            return;
        }

        printEven(n - 1);

        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printEven(900

        );
    }
}*/

/*public class june13 {

    public static int sum(int n) {
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 500;
        System.out.println("Sum = " + sum(n));
    }
}*/
/*public class june13 {

    static int fact(int n) {
        if (n == 1) {      
            return 1;
        }

        return n * fact(n - 1);   
    }

    public static void main(String[] args) {
        int num = 8;

        System.out.println("Factorial = " + fact(num));
    }

        }*/
      /*  public class june13 {

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        System.out.println(power(a, b));
    }
}*/
 
/*public class june13 {

    static int countDigits(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Digits = " + countDigits(num));
    }
}*/ 

/*public class june13 {

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 6789;
        System.out.println("Sum = " + sumDigits(num));
    }
}*/