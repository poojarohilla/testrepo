package Day2;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     swapping obj = new swapping();
     obj.swap();
	}

	
	void swap() {
		
		int a = 10;
		int b= 20;
		int c ;
		
		System.out.println("before swapping the value of a is " +a );
		System.out.println(b);
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}
