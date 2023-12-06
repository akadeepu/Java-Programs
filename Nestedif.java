class Nestedif
{
	public static void main(String [] args)
	{
		int no1=60;
		int no2=80;
		int no3=50;
		
		if(no1>no2){
			if(no1>no3)
			{
				System.out.println("No1 is greater");
			}
			}
		if(no2>no1){
			if(no2>no3){
				System.out.println("no2 is greater");
			}
		}
		
		else{
			System.out.println("mo3 is greater");
		}
	}
}
