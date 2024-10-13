package org.example;
//TASK1: Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String realPassword="adnica";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String password = reader.nextLine();
        if(password.equals(realPassword)){
            System.out.println("You have successfully logged in!");
        }
        else {
            System.out.println("Try again!");
        }
        scanner.close();
    }
}*/

//TASK2: Create a program that asks the user for three numbers and then prints their sum.
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2= scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}*/

//TASK3: Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num=1;
        while(num!=0){
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            sum += num;
        }
        System.out.println("The sum of the numbers is: "+sum);
    }
}*/

//TASK4: Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop.
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        while(first<=second){
            System.out.println(first);
            first++;
        }
        scanner.close();
    }
}
 */

//TASK5
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int b = num1.nextInt();
        int a = 2;
        System.out.println((int) Math.pow(a, b));
        num1.close();
    }
}*/

//TASK6
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String text = "In the beginning there were the swamp, the hoe and Java";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            System.out.println(text);
        }
        scanner.close();
    }
}*/
