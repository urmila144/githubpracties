package githubpracties;

public class Lower_Upper_Cases {

	public static void main(String[] args) {
		
		String s= "Welcom To India";
		String lower ="";
		String upper="";
		for(int i=0; i<s.length(); i++)
		{
			
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper=upper+ch;
			}
			else
			{
				lower=lower+ch;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
	}
}
