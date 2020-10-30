public class prime
{
	public static void main(String[] args)
	{
		int n=11,flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{	flag=1;
				break;
			}
		}
		if(flag==1)		
			System.out.println("The number "+n+" is not prime number");
		else
			System.out.println("The number "+n+" is a prime number");
	}

}