class Swapping
{
	public static void main (String[] args )
	{
		int no1=10;
		int no2=20;
		
		no1= no1+no2;
		no2= no1-no2;
		no1= no1-no2;
		
		System.out.println("After swapping no1 is "+no1 );
		System.out.println("After Swapping no2 is "+no2 );
	}
}
