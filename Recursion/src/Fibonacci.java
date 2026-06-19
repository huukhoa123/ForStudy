import java.util.Scanner;

public class Fibonacci {


    public static int Fibonaci(int x ){
        if(x==1|| x == 0){
            return x;
        }
        else{
            return Fibonaci(x-1)+Fibonaci(x-2);
        }
    }

    public static void main(String[] args) {

        System.out.println(Fibonaci(12));
    }

}
