package javaday3;
class grandparent{
	int a = 40;
	int b = 60;
}
class parent extends grandparent {
	
	void add () {
		int c=a+b;
		System.out.println(c);
	}
}


public class singleinheritance extends parent {

	
	void sub() {
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      singleinheritance obj = new singleinheritance();
      obj.add();
      obj.sub();
      
	}

}
