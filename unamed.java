import java.util.*;
class unamed
{
int a;
void input()
{
a=10;
return a;
}
void display()
{
System.out.println("Hello");
System.out.println(a);
}
public static void main(String x[])
{
unamed u = new unamed();
u.input();
u.display();
new unamed().input();
new unamed().display();


}
}