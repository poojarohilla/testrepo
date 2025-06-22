package javaday3;


class topparent{
	int a = 40;
	int b = 60;
}
 
class child1 extends topparent{
	void add() {
		int c = a+b;
		System.out.println(c);
	}
}

class child2 extends topparent{
	void sub() {
		int c = a-b;
		System.out.println(c);
	
	}
}
public class hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      child1 obj = new child1();
      obj.add();
      child2 obj1= new child2();
      obj1.sub();
	}

}
