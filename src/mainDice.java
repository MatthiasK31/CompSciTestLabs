/*
Matthias Kim
Dice Roll Lab
9/8/2020
Extra: You can run the program again
 */

import java.util.Scanner;

class mainDice {
    public static void yes() {

        //variables
        int totalRoll = 0;
        int counter = 0;
        int targetNumber = 0;
        Scanner s = new Scanner(System.in);
        //declare the other dice file in a variable to call functions in it from here
        dice a = new dice();
        dice b = new dice();

        //the paramaters of a dice roll cannot be less than 2 or greater than 12
        while (!(targetNumber >= 2 && targetNumber <= 12)) {
            System.out.println("Enter your target number: ");
            targetNumber = s.nextInt();
        }

        //run until the total roll value is equal to the target total roll
        while (totalRoll != targetNumber) {
            //call the roll function in dice file, add the two values
            int num1 = a.doTheThing();
            int num2 = b.doTheThing();
            totalRoll = num1 + num2;
            //print the values for user to see and increate the counter value
            System.out.println("The dice came up as " + num1 + " and " + num2 + " for a total of " + totalRoll);
            counter++;
        }
        //print the total times it took to get that number
        System.out.println("That took " + counter + " tries to get a total of " + targetNumber);
    }

    public static void main(String[] args) {
        //make variables
        String ans = " ";
        Scanner sc = new Scanner(System.in);

        //infinite for loop to run program again
        for (int i = 0; i >= 0; i++) {
            yes();
            System.out.println("Run again?");
            ans = sc.nextLine();
            if (ans.equals("yes") || ans.equals("y") || ans.equals("Y") || ans.equals("Yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}
