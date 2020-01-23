//GREATEST USING COMMAND LINE ARGUMENTS
import java.util.*;
class greatestcomm
{
public static void main(String x[])
{
int a,b,c;
a = Integer.parseInt(x[0]);
b = Integer.parseInt(x[1]);
c = Integer.parseInt(x[2]);
if(a > b && a> c)
System.out.println(a);
else if (b > a && b>c)
System.out.println(b);
else if(c > a && c> b)
System.out.println(c);





}
}
