package pkg1;

public class ClassC {

	public static void main(String[] args) {
		ClassA X=new ClassB();         //UP-CASTING ClassA & ClassB common method call
		X.address();                   //But implement the ClassB method
		X.clgname();
		System.out.println("=========================");
		
		ClassA y=new ClassA();
		y.address();
		y.clgname();
		System.out.println("===========================");
		
		ClassB z=new ClassB();
		z.address();
		z.clgname();
		z.phone();
		System.out.println("================");
		
		ClassB k=(ClassB)X;         //DOWN-CASTING ClassB
		k.address();
		k.clgname();
		k.phone();
	

	}

}
