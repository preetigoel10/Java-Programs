//ADDITION OF FLOAT INT AND DOUBLE 
class fgh
{
public static void main(String x[])
{
int a,b,c;
float d,e,f;
double g,h,i;
a = Integer.parseInt(x[0]);
b = Integer.parseInt(x[1]);
c= a+b;
System.out.println("Sum of integers is "+c);
d =Float.parseFloat(x[2]);
e= Float.parseFloat(x[3]);
f = d+e;
System.out.println("Sum of float numbers is "+f);
g = Double.parseDouble(x[4]);
h = Double.parseDouble(x[5]);
i = g+h;
System.out.println("Sum of double numbers is "+i);
}
}