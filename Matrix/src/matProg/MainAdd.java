package matProg;

public class MainAdd {
	public static void main(String[] args) {
		AddMatrix am=new AddMatrix();
		System.out.println("enter first matrix");
		int a[][]=am.readArray();
		System.out.println("enter second matrix");
		int b[][]=am.readArray();
		System.out.println(":enter first matrix");
		am.display(a);
		System.out.println(":enter second matrix");
		am.display(b);
		System.out.println("Addition of matrix");
		int c[][]=am.addMat(a, b);
		//for (int i = 0; i < c.length; i++) {
			//for (int j = 0; j < c[i].length; j++) {
				am.display(c);
				
			//}
			
			
		//}
		
	}

}
