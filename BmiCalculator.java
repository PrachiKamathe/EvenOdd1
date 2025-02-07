import java.util.Scanner;
class Bmicalculator
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the weight in kilogram");
float weight=sc.newFloat();
System.out.println("Enter the height");
float height=sc.newFloat();
double pounds=sc.nextdouble();
float bmi=(weight/0.45359237);
}
}
