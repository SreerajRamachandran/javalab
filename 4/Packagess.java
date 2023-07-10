import java.util.Scanner;
import Arithmetic.*;
public class Packagess{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("operations");

System.out.println("enter first number");
double num1 = sc.nextDouble();

System.out.println("enter second number");
double num2 = sc.nextDouble();


Arithmetic addition = new Addition();
double sum = addition.calculate(num1,num2);
System.out.println("sum"+sum);

Arithmetic subtraction = new Subtraction();
double diff = subtraction.calculate(num1,num2);
System.out.println("Difference"+diff);

Arithmetic multiplication = new Multiplication();
double  mul= multiplication.calculate(num1,num2);
System.out.println("Product"+mul);

Arithmetic division = new Division();
double div = division.calculate(num1,num2);
System.out.println("Quotient"+div);
}
}
