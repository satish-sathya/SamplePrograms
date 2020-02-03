package sampleprogram;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String name="satish";
		int lengt=name.length();
		String rev="";
		for (int i =lengt-1; i >=0; i--)
		{
			rev=rev+name.charAt(i);
			  
		}
		System.out.println("reverse of name is = " + rev);


	}

}  
