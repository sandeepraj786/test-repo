import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		Project p1=new Project(1200,1,"WaterBottle");
		Project p2 =new Project(1400,3,"Shampoo");
		LinkedList<Project>lst=new LinkedList<Project>();
		lst.add(p1);
		lst.add(p2);
		Project p10 = new Project(23500,2,"Mobile");
		lst.add(1, p10);
		for(Project p:lst)
			System.out.println(p.price+" "+p.qty+" "+p.type);
		{
			
		}
	}

}
