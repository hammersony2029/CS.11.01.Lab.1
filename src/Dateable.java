import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =-1;

        while (age < 0) {
            try {
                System.out.print("Enter your age: ");
                age = Integer.parseInt(scanner.nextLine());

                if (age < 0){
                    System.out.println("Invalid input! Please enter a whole number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a whole number.");
            }
        }

        int youngestAge = 7 + (age / 2);
        System.out.println(age + "-year olds should date somebody who is at least " + youngestAge + " years old." );
    }
}