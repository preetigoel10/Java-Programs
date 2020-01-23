import java.util.*;
/*class fun
{ //Function Overload8ng
	void add(int a,float b)
	{
		System.out.println("In 1st function");
	}
	
	void add(float a,int b)
	{
		System.out.println("In 2nd function");
	}
	/*void add (double a,double b)
	{
		System.out.println("In 3rd function");
	}*/
	
	/*public static void main(String [] args)
	{
		fun a1 = new fun();
		/*a1.add(2,7.3);
		a1.add(7.3,2);
		a1.add(7.5f,12);
	*/
	//a1.add(3.6f,7.6f);
	//a1.add(3,6); ambigous
	//a1.add(3.6f,7);
	/*a1.add(7,3.4f);
	}
	
}*/
/*
class fun2
{
  void dis()
   {
    System.out.println("Base class");
   }
}	
class fun extends fun2
{
   void dis()
   {
    System.out.println("Derived class");	   
   }
public static void main(String [] args)
{
	fun f = new fun();
	f.dis();
	fun2 f1 = new fun2();
	f1.dis();
	fun2 f2 = new fun();
	f2.dis();
	
}	
}
*/
class fun
{
	public static void main(String [] args)
	{
		float a[] = new float[5];
		getdata(a);
		display(a);
		sort(a);
		display(a);
		unique(a);
	}
	static void getdata(float a[])
	{
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		a[i] = sc.nextFloat();
		}
		
	}
	static void display(float a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
	static void sort(float a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					float temp;
					temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
	}
	static void unique(float a[])
	{
		int temp=0;
		System.out.println("Unique elements are");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[j] == a[i])
			{
			temp++;
			}	
		}
	if(temp>0)
		System.out.println(a[i]);
	}
	}
}