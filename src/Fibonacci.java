/** Access Code
 * Created by charlynbuchanan on 3/17/15.
 * This program accepts as input an integer N and returns the N-th Fibonacci number.
 */


public class Fibonacci {
    public static int nthFibonacci(int x) {


        int a = 0;
        int b = 1;
        int c = a+b;
        int i = x;
        //int nthFib = c;

        if (x <= 0) {
            System.out.println("no negative numbers or 0!");
        }
        if (x == 1) {
            System.out.println("0");
        }
        if (x == 2) {
            System.out.println("1");
        }
        else {
            for (i = 3; i <= x; i++){
                c = a + b;
                a = b;
                b = c;

                //System.out.println(c); <- this prints out all of the
                //return c;
                //break;
            }
            System.out.println(c);
        }

        return (c);


    }


    public static void main(String[] args) {

        nthFibonacci(2);

    }

}





