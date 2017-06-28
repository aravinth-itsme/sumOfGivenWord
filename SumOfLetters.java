import java.util.*;
public class SumOfLetters
{
	public int letter(String input)
	{
		int a=0, b=1, c, sum=0;
		
		if(!(input.matches("[A-Za-z]+")))
			throw new UnsupportedOperationException("Invalid input");
		
		Map<Integer,String> alpha = new LinkedHashMap<Integer,String>();		
		for(int i=0; i<26; i++)
		{
			alpha.put(a,String.valueOf((char)(i+65)));
			c = a+b;
			a = b;
			b = c;
		}				
		for(int len=0; len < input.length(); len++)
		{
			for(Map.Entry<Integer,String> e : alpha.entrySet())
			{
				String ch = ""+input.charAt(len);				
				if(e.getValue().equals(ch.toUpperCase()))
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
		SumOfLetters s = new SumOfLetters();
		int res = s.letter(word);
		System.out.println("Sum of "+word+" is: "+res);
	}
}
