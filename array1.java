import java.util.*;
class array1
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
int m,n;
m = sc.nextInt();
n = sc.nextInt();
int arr[][] = new int [m][n];
for(int i=0;i<arr.length;i++)
{

for(int j=0;j<arr[i].length;j++)
{
arr[i][j] = sc.nextInt();
}
}
dis(arr);
}
static void dis(int arr[][])
{
for(int m[]: arr)
{
for(int n: m)
{
System.out.print(n+" ");
}
System.out.println();
}


}
}