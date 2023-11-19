//WAP to find greater number between two numbers using ternary operator (?:)
//Syntax: (variable = condition ? expression 1 : expression2) 

class GreaterNumber2
{
	public static void main(String[] args)
	{
		int no1= 10;
		int no2= 20;
		
		int result = (no1>no2) ? no1 : no2;
		System.out.println(result+ " is greater");
	}
}