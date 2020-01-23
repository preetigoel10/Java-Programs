
public class locker {

	public static void main(String[] args) {
		int arr[] = new int[50];
		for(int i=0;i<50;i++)
		{
			arr[i] = 0;
		}
		for(int i=0;i<50;i++)
		{
			arr[i] = 1;
		}
		for(int i=2;i<25;i++)
		{
			arr[i] =1;
			if(i+i < 50)
			{
			      if(arr[i+i]==0)
			      {
				    arr[i+i]=1;
			      }
			      else if(arr[i+i] ==1)
			      {
				     arr[i+i]=0;
                  }
			}
			
		}
		for(int m:arr)
		System.out.println(m);

	}

}
