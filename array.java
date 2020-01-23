import java.util.*;
class array
{
public static void main(String x[])
{
/*int a[] = new int[5];
a[0]= 1;
a[1] = 2;
a[2] = 3;
a[3] = 4;
a[4] = 5;
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
*/
Scanner sc= new Scanner(System.in);
int n;
n = sc.nextInt();
float arr[] = new float[n];
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextFloat();
}

System.out.println("USING FOR LOOP");
for(int i = arr.length-1; i>=0;i--)
System.out.println(arr[i]);
System.out.println("USING FOR EACH LOOP");
for(float m:arr)
System.out.println(m);
float sum=0.0f;
float min =arr[0];
float max = arr[0];
for(float m:arr)
{
if(m<min)
{
min = m;
}
if(max<m)
{
max = m;
}
sum = sum + m;
}
System.out.println(sum);
float avg;
avg = sum/n;
System.out.println(avg);
System.out.println("The minimum element is"+min);
System.out.println("The maximum element is"+max);
}
}