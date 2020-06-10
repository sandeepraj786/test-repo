import java.util.Scanner;
public class MainString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.next();
		System.out.println("enter a string");
		String b=sc.next();
		sc.close();
		System.out.println(a.length()+b.length());
		if(a.compareTo(b)==0)
			System.out.println("yes");
		else
			System.out.println("no");
	String str=a.substring(0,1);
	String str2=a.substring(1);
	String str1=b.substring(0,1);
	String str3=b.substring(1);
	String p1=str.toUpperCase();
	String p2=str1.toUpperCase();
	System.out.println(p1+""+str2+" "+p2+""+str3);
	int s=a.compareTo(b);
	System.out.println(s);
	



	}



}
