package stringP;

public class Vowels {

	public static void main(String[] args) {
		String str = "Welcome";

		for(int i=0;i<str.length();i++)
		{
			String result = "";

			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				result="pass";
			}else
			{

				result="fail";
			}
			System.out.println(result);
		}
	}

}
