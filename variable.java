import java.util.*;
/*class variable
{
int a,b;
static int c;
public static void main(String x[])
{
int d =10;
variable o = new variable();
variable o1 = new variable(); 
System.out.println(o.a);
o1.a = 10;
System.out.println(o1.a);
o.c = 20;
System.out.println(o1.c);

}
}
*/
/*//Greater number using instance variables 
class variable
{
int a,b;
public static void main(String x[])
{
variable o = new variable();
variable o1 = new variable();
Scanner sc = new Scanner(System.in);
o.a = sc.nextInt();
o.b = sc.nextInt();
if(o.a > o.b)
{
System.out.println(o.a+" is greater");
}
else
{
System.out.println(o.b+" is greater");
}


}
}
*/
/*
class variable
{
int age;
static int count; 
S tring name; 
void getdata()
{
Scanner sc = new Scanner(System.in);
age = sc.nextInt();
name = sc.nextLine();
count++;
}
void display()
{
System.out.println(age + name);
}
public static void main(String x[])
{
variable o = new variable();
o.getdata();
o.display();
variable o1 = new variable();
o1.getdata();
o1.display();
System.out.println("The number of students are" + count);


}
}
*/
class variable
{
void sum(int arr[])
{
int sum1= 0;
for(int i=0;i<arr.length;i++)
{
sum1 = sum1 + arr[i];
}
System.out.println("The sum of numbers is "+sum1);
}
public static void main(String x[])
{
int n;
variable o = new variable();
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
o.sum(arr);

}
}