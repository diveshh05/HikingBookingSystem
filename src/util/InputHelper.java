package util;

import java.util.Scanner;

public class InputHelper {

    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String prompt){
        while(true){
            System.out.print(prompt);
            String input = sc.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a whole Number");
            }
        }
    }

    public static double readDouble(String prompt){
        while(true){
            System.out.print(prompt);
            String input = sc.nextLine();

            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a number");
            }
        }
    }
    public static String readString(String prompt){
        while(true){
            System.out.print(prompt);
            String input = sc.nextLine();

            if(input.trim().isEmpty()){
                System.out.println("Error: Cannot be empty");
            }
            else{
                return input.trim();
            }
        }
    }
    public static int readIntRange(String prompt, int min, int max){
        while(true){
            int number = readInt(prompt);

            if(number >= min && number <= max){
                return number;
            }
            else{
                System.out.println("Error: Please enter a number class between " + min + " and" + max);
            }

        }
    }
}
