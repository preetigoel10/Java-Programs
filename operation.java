import java.util.*;
class operation
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
   int m;
   int n;
m = sc.nextInt();
n= sc.nextInt();
int arr1[][] = new int[m][n];
int arr2[][] = new int[m][n];
getdata(arr1);
getdata(arr2);
display(arr1);
display(arr2);
System.out.println("Enter your choice");
int c;
c = sc.nextInt();
int arr3[][] = new int[m][n];

switch(c)
{
case 1:
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
arr3[i][j] = arr1[i][j] + arr2[i][j];
}
}
display(arr3);
break;

case 2:
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
arr3[i][j] = arr1[i][j] - arr2[i][j];
}
}
display(arr3);
break;

case 3:
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{int sum =0;
for(int k=0;k<arr1[i].length;k++)
{
sum=sum+ arr1[i][k] * arr2[k][j];
arr3[i][j] = sum;
}

}
}
display(arr3);
break;

default:
System.out.println("Wrong choice");

}

}

static void getdata(int arr[][])
{
Scanner sc = new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j] = sc.nextInt();
}
}

}
static void display(int arr[][])
{
for(int m[] : arr)
{
for(int n: m)
{
System.out.print(n+" ");
}
System.out.println();
}
}


}