import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your country: ");
        String country = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(country + " is my country and my name is " + name + "." + " I am " + age + " years old");

        scanner.close();
    }
}