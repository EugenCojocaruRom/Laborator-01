import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for value a
        System.out.print("a = ");
        //Declare variable a of type int
        int a;
        //Read value a from keyboard
        a = sc.nextInt();
        //Display label for value b
        System.out.print("b = ");
        //Declare variable b of type int
        int b;
        //Read value b from keyboard
        b = sc.nextInt();
        //Display label for value c
        System.out.print("c = ");
        //Declare variable c of type int
        int c;
        //Read value c from keyboard
        c = sc. nextInt();
        //Set rule to check if the triangle can exist based on the values of a, b and c
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            //Display message that the triangle can exist
            System.out.print("These can be the values of a triangle.\n");
        }
        //Set rule to check if the triangle can be equilateral
        if ((a == b) && (a == c)) {
            //Display message that the triangle is equilateral
            System.out.print("The triangle with the values " + a + ", " + b + ", " + c +
                    " is an equilateral triangle.\n");
        }
        //Set rule to check if the triangle can be isosceles
        if ((a == b) && (a != c) || (a == c) && (a != b) || (b == c) && (b != a)) {
            //Display message that the triangle is isosceles
            System.out.print("The triangle with the values " + a + ", " + b + ", " + c +
                    " is an isosceles triangle.\n");
        }
        //Set rule to check if the triangle can be right angle
        if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
                (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) ||
                (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))) {
            //Display message that the triangle is right angle
            System.out.print("The triangle with the values " + a + ", " + b + ", " + c +
                    " is a right angle triangle.\n");
        }
        //Other cases
        else {
            //Display message for impossible triangle
            System.out.print("This cannot be a triangle");
        }
    }
}