import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for value a
        System.out.print("a = ");
        //Declare variable a of type int
        int a;
        //Read a from keyboard
        a = sc.nextInt();
        //Display label for value b
        System.out.print("b = ");
        //Declare variable b of type int
        int b;
        //Read b from keyboard
        b = sc.nextInt();
        //Display label for value c
        System.out.print("c = ");
        //Declare variable c of type int
        int c;
        //Read c from keyboard
        c = sc.nextInt();
        //Declare variable p of type double for half perimeter
        double p;
        //Calculate half perimeter p of triangle
        p = (double) (a + b + c) / 2;
        //Calculate triangle surface
        double A = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        //Display value of triangle surface
        System.out.print("The surface of the triangle is " + A);
    }
}