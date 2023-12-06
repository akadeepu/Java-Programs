class Palindrome
{
	int no=12345;
	
	int temp=no;
	int rem, rev=0;
	while (temp != 0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	System.out.println("no: " +no);
	System.out.println("rev:" +rev);
	
	if(no==rev)
	
	{
		System.out.println("no is palindrome");
	
	}else
	
	{
		System.out.println("no is not palindrome");
	}
}
