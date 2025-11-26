import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);

        //Display value x
        System.out.print("x = ");
        //Declare variable x of type int
        int x;
        //Read value x from keyboard
        x = sc.nextInt();

        //Display value y
        System.out.print("y = ");
        //Declare variable y of type int
        int y;
        //Read value y from keyboard
        y = sc.nextInt();

        //Set condition for point in quadrant 1
        if (x > 0 && y > 0) {
            //Display message for point in quadrant 1
            System.out.print("The point in is quadrant 1");
        }

        //Set condition for point in quadrant 2
        else if (x < 0 && y > 0) {
            //Display message for point in quadrant 2
            System.out.print("The point is in quadrant 2");
        }

        //Set condition for point in quadrant 3
        else if (x < 0 && y < 0) {
            //Display message for point in quadrant 3
            System.out.print("The point is in quadrant 3");
        }

        //Set condition for point in quadrant 4
        else if (x > 0 && y < 0) {
            //Display message for point in quadrant 4
            System.out.print("The point is in quadrant 4");
        }

        //Set condition for point on semi-axis between quadrants 1 & 2
        else if (x == 0 && y > 0) {
            //Display message for point on semi-axis between quadrants 1 & 2
            System.out.print("The point is on the semi-axis between quadrants 1 and 2");
        }

        //Set condition for point on semi-axis between quadrants 2 & 3
        else if (y == 0 && x < 0) {
            //Display message for point on semi-axis between quadrants 2 & 3
            System.out.print("The point is on the semi-axis between quadrants 2 and 3");
        }

        //Set condition for point on semi-axis between quadrants 3 & 4
        else if (x == 0 && y < 0) {
            //Display message for point on semi-axis between quadrants 3 & 4
            System.out.print("The point is on the semi-axis between quadrants 3 and 4");
        }

        //Set condition for point on semi-axis between quadrants 1 & 4
        else if (y == 0 && x > 0) {
            //Display message for point on semi-axis between quadrants 1 & 4
            System.out.print("The point is on the semi-axis between quadrants 1 and 4");
        }

        //Set condition for point at intersection of axes x & y
        else {
            //Display message for point at intersection of axes x & y
            System.out.print("The point is in the middle, on the intersection of the x & y axes.");
        }
    }
}