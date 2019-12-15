/**
 * Check if a String is a Palindrome
 * @author asharda
 *
 */
public class Palindrome {

	public static  boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("test"));
		
		
	}

}
