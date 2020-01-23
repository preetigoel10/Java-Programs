//Greatest of three numbers
import java.util.*;
class greatest
{
public static void main(String x[])
{
int a,b,c;
System.out.println("Enter any three numbers");
Scanner sc = new Scanner(System.in); 
a= sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
/* if(a > b && a> c)
System.out.println(a);
else if (b > a && b>c)
System.out.println(b);
else if(c > a && c> b)
System.out.println(c);
*/ 
if(a>b)
{
if(a>c)
{
System.out.println(a);
}
}
 
if(b>c)
{
if(b>a)
{
System.out.println(b);
}
}

if(c>a)
{
if(c>b)
{
System.out.println(c);
}
}
}
}