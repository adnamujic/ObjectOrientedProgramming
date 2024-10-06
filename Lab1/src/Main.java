//TASK1
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("My name is Adna Mujić");
        }
    }
 */

//TASK2
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("(And all the people of the world)");
    }
}
 */

//TASK3
/*
public class Main{
    public static void main(String[] args){
        int days=365;
        int hours=24;
        int minutes=60;
        int seconds=60;
        int total=days*hours*minutes*seconds;
        System.out.println("One year has "+ total+" seconds." );
    }
}
 */

//TASK4
/*
import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Type a number: ");
        num1 = myObj.nextInt();

        System.out.print("Type another number: ");
        num2 = myObj.nextInt();

        sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}
 */

//TASK5
/*
import java.util.Scanner;
class MyClass{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=myObj.nextInt();

        if(num>0){
            System.out.print("This number is positive. It is a number " +num+".");
        }
        else{
            System.out.print("This number is negative. It is a number "+num+".");
        }
        myObj.close();
    }
}
 */

//TASK6
/*
import java.util.Scanner;
class MyClass{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1=myObj.nextInt();

        System.out.print("Enter second number: ");
        int num2=myObj.nextInt();

        if(num1>num2){
            System.out.println("First number "+num1+" is bigger than the second number "+num2+".");
        }
        else if(num2>num1){
            System.out.println("Second number "+num2+" is bigger than the first "+num1+".");
        }
        else{
            System.out.println("Numbers are equal.");
        }
        myObj.close();
    }
}
 */

