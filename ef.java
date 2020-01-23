import java.util.*;
class ef
{
public static void main(String x[])
{
int a ;
float b;
char c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers ");
a = sc.nextInt();
b= sc.nextFloat();
System.out.println("Integer data is "+a);
System.out.println("Float data is "+b);
System.out.println("Enter a character ");
c = sc.next().charAt(0);
System.out.println("Char data is "+c);
String s,s1;
System.out.println("Enter a word ");
s = sc.next();
sc.nextLine();
System.out.println("String data is "+s);
System.out.println("Enter a sentence ");
s1 = sc.nextLine();
System.out.println("String data is "+s1);
 
}
}