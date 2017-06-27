import java.util.*;
public class Fib extends Exception
{
	public int letter(String input)
	{
		int a=0, b=1, c, sum=0;
		Map<Integer,String> alpha = new LinkedHashMap<Integer,String>();		
		for(int i=0; i<26; i++)
		{
			alpha.put(a,String.valueOf((char)(i+65)));
			c = a+b;
			a = b;
			b = c;
		}		
		// System.out.println("Input is: "+ input);
		for(int len=0; len < input.length(); len++)
		{
			for(Map.Entry<Integer,String> e : alpha.entrySet())
			{
				/* if(input.charAt(len) == ' ')
					throw new UnsupportedOperationException("Invalid input");
				else  */if(e.getValue().equals(""+input.charAt(len)))
					sum += e.getKey();
			}
		}		
		return sum;
	}		
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the keyword:");
		String word = sc.next();
		Fib f = new Fib();
		int res = f.letter(word);
		System.out.println("Sum of "+word+" is: "+res);
	}
}