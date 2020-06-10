import java.util.Scanner;

public class CountWords
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String st=sc.nextLine();
		int c=CountWords.coutwords(st);
		System.out.println(c);
		
	}
	private static int  coutwords(String st)
	{
		char ch[]=st.toCharArray();
		int wc=0;
		for(int i=0;i<st.length();i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '|| ch[i]==39)
				wc++;
		}
		return wc;
	}

}
