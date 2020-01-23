//PRINT DAY OF THE WEEK USING SWITCH CASE
import java.util.*;
class day
{
public static void main(String x[])
{
char c;
Scanner sc = new Scanner(System.in);
c= sc.next().charAt(0);
switch (c)
{
case 'M':
System.out.println("Monday");
break ; 

case 'T':
System.out.println("Tuesday \nThursday");
break;

case 'W':
System.out.println("Wednesday");
break;

case 'F':
System.out.println("Friday");
break;

case 'S':
System.out.println("Saturday \nSunday");
break;

default:
System.out.println("Wrong choice");

}


}
}