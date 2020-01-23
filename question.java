import java.util.*;
public class question {
	static void countFreq(int arr[],int n)

{
    
    for(int i=0;i<arr.length;i++)
    {
        int temp =0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                temp++;
            }
        }
        System.out.println(arr[i] + " occurs"+temp+" times");
    }
    
    
}
    static void main(java.lang.String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();			
		}
		countFreq(arr,n);
	}
}