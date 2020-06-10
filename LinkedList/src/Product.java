import java.util.ArrayList;

public class Product {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println("forward direction:");
		for(int i=0;i<al.size();i++)
		{
			String sr=al.get(i);
			
			System.out.println(sr);
		}
		 System.out.println("backward direction:");
		for(int i=al.size()-1;i>=0;i--)
		{
			 String sr=al.get(i);
			
			 System.out.println(sr);
			 
		}
		System.out.println("............");
		for(String str:al)
		{
			System.out.println(str);
		}
	}

}
