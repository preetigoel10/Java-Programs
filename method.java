import java.util.*;
class method
{
int a;
static int b;
static void dis()
{
System.out.println(b);
}
void display()
{
a = 10;
b = 5;
System.out.println(a+" "+b);
}
public static void main(String x[])
{
dis();
method.dis();
method m = new method();
m.display();
m.dis();

}
}