import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display message regarding hour format
        System.out.println("The time is expressed in 24 hour format (hh:mm:ss)\n");

            // --> values for session start time
        //Display value hh1 - hour for session start time
        System.out.print("hh1 = ");
        //Declare variable hh1 of int type
        int hh1;
        //Read value of hh1 from keyboard
        hh1 = sc.nextInt();
        //Display value mm1 - minutes for session start time
        System.out.print("mm1 = ");
        //Declare variable mm1 of int type
        int mm1;
        //Read value of mm1 from keyboard
        mm1 = sc.nextInt();
        //Display value ss1 - seconds for session start time
        System.out.print("ss1 = ");
        //Declare variable ss1 of type int
        int ss1;
        //Read value of ss1 from keyboard
        ss1 = sc.nextInt();

            // --> values for session end time
        //Display value hh2 - hour for session end time
        System.out.print("hh2 = ");
        //Declare variable hh2 of type int and read from keyboard
        int hh2 = sc.nextInt();
        //Display value mm2 - minutes for session end time
        System.out.print("mm2 = ");
        //Declare variable mm2 of int type and read from keyboard
        int mm2 = sc.nextInt();
        //Display value ss1 - seconds for session end time
        System.out.print("ss2 = ");
        //Declare variable ss2 of type int and read from keyboard
        int ss2 = sc.nextInt();
        //Display session start time
        System.out.print("Session start time: " + hh1 + ":" + mm1 + ":" + ss1 + "\n");
        //Display session end time
        System.out.print("Session end time: " + hh2 + ":" + mm2 + ":" + ss2 + "\n");
        //Declare and initialize variable for midnight (hour = 24, minutes = 0, seconds = 0)
        int mH = 86400; //--> hM stands for 'midnight' and 'Hour'

        //Calculate time in seconds for session start time
        int T1 = ss1 + mm1*60 + hh1*3600;
        System.out.print("T1 = " + T1 + "\n");
        //Calculate time in seconds for session end time
        int T2 = ss2 + mm2*60 + hh2*3600;
        System.out.print("T2 = " + T2 + "\n");

        //Set condition for session before midnight same day
        if ((T1 < T2) && (T2 < mH)) {
            //Calculate difference T2 - T1
            int sessDuration1 = T2 - T1;
            //Display session duration in seconds
            System.out.print("Session duration = " + sessDuration1);
            /*Declare variable and calculation method for finding number of hours from session duration
            expressed in seconds*/
            int x1 = sessDuration1/3600;
            //Declare variable and calculation method for remainder from previous division
            double y1 = sessDuration1%3600;
            //Declare variable and calculation method (by casting) for minutes
            int x2 = (int) (y1/60);
            /*Declare variable and calculation method for remainder from previous division
            - these are the seconds*/
            int x3 = x2%60;
            //Display the session time
            System.out.print("\nSession time = " + x1 + ":" + x2 + ":" + x3);
        }

        //Set condition for session starting one day and ending the next day
        else if ((T1 < mH) && (T2 < T1)) {
            //Calculate the duration of the first part of the session (before midnight)
            int sessDuration2 = mH - T1;
            //Calculate the duration of the session in seconds
            int sessNight = sessDuration2 + T2;
            //Display session duration in seconds
            System.out.print("Session duration = " + sessNight);
            /*Declare variable and calculation method for finding number of hours from session duration
            expressed in seconds*/
            int x1 = sessNight/3600;
            //Declare variable and calculation method for remainder from previous division
            double y1 = sessNight%3600;
            //Declare variable and calculation method (by casting) for minutes
            int x2 = (int) (y1/60);
            /*Declare variable and calculation method for remainder from previous division
            - these are the seconds*/
            int x3 = x2%60;
            //Display the session time
            System.out.print("\nSession time = " + x1 + ":" + x2 + ":" + x3);
        }
    }
}