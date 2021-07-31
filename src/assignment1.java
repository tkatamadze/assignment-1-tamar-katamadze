import java.util.Scanner;

public class assignment1 {

    public static void main(String[] args) {
    //1. შემოგვდის რიცხვი. გამოვიტანოთ შეტყობინება შემოტანილი რიცხვი დადებითია, უარყოფითი თუ 0

        System.out.println("Task 1: Please enter a number below to define if it is positive, negative or zero");

        Scanner input = new Scanner(System.in);
         int a = input.nextInt();

         if (a > 0) {
             System.out.println("Result: Number " + a + " is positive");
         } else if (a < 0) {
             System.out.println("Result: Number "+ a + " is negative");
         } else {
             System.out.println("Result: Number " + a + " is zero");
         }

    //2. შემოგვდის რიცხვი. გამოვიტანოთ შეტყობინება ეს წელი ნაკიანია თუ არა.

        System.out.println("\nTask 2: Please enter a year below to define if it is a leap year");

        int year = input.nextInt();

        if (year % 400 == 0 || year % 4 ==0 && year % 100 != 0) {
            System.out.println("Result: Year " + year + " is leap");
        } else  {
            System.out.println("Result: Year " + year + " is not leap");
        }

    //3. შემოგვდის რიცხვი. გამოვიტანოთ შეტყობინება ეს რიცხვი ლუწია თუ კენტი.

        System.out.println("\nTask 3: Please enter a number below to define if it is even or not");

        int b = input.nextInt();

        if (b % 2 == 0) {
            System.out.println("Result: Number " + b + " is even");
        } else  {
            System.out.println("Result: Number " + b + " is not even");
        }
    /*4. შემოგვდის 3 რიცხვი:
    •	დავბეჭდოთ ეს რიცხვები ზრდადობით
    •	გამოვიტანოთ ამ რიცხვების საშუალო
    */

        System.out.println("\nTask 4: Please enter three numbers below to sort it ascending and calculate their average");

        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();


        int average = (c + d + e ) / 3;

        System.out.println("Result: Ascending order is " + " Average is " + average);




        }



    }



