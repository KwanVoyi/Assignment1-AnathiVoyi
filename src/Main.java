import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String userName;
        String afteroon = "Good afternoon";
        String morning = "Good morning";
        int userAge;
        int appAge;

        Scanner input = new Scanner(System.in);
        Date time = new Date();
        LocalTime local = LocalTime.now();

        System.out.print("Please enter your name: ");
        userName = input.nextLine();

        if (local.compareTo(LocalTime.NOON) > 0) {
            System.out.println(afteroon + " " + userName + ".");
        } else {
            System.out.println(morning + " " + userName + ".");
        }

        System.out.print("Please provide your age: ");
        String age = input.nextLine();
        userAge = Integer.parseInt(age);

        Random randomAge = new Random();
        appAge = randomAge.nextInt(90) + 18;

        int maximumNumber = Math.max(appAge, userAge);
        int minimumNumber = Math.min(appAge, userAge);

        int compareAge = maximumNumber - minimumNumber;


        if (maximumNumber > userAge) {
            System.out.println("I'am " + userAge + " years old, " + "which is " + Math.abs(compareAge) + " older than you.");
        } else {
            System.out.println("I'am " + userAge + " years old, " + "which is " + Math.abs(compareAge) + " younger than you.");
        }
        System.out.println("Twice my age would be: " + appAge * 2);
        if(userAge % 2 == 0) {
            System.out.println("My age is an even number");
        }
        else {
        System.out.println("My age is an odd number");
        }

        System.exit(0);
    }
}









