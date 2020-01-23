import java.util.*;
class jaggedArray
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
int r ;
r= sc.nextInt();
int a[][] = new int[r][];

for(int i=0;i<a.length;i++)
{
a[i] = new int[i+1];
}
int count = 0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j] = count;
count ++;
}
}
dis(a);
}

static void dis(int a[][])
{
for(int m[] : a)
{
for(int n: m)
{
System.out.print(n+" ");
}
System.out.println();
}

}
}



