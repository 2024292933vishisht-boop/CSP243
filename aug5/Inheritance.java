package aug5;
class Vishisht{
	public void sharma(int a) {
		System.out.println(a+a);
	}
	public void sharma(int a, int b) {
		System.out.println(a+b);
	}
}

class Child extends Vishisht{
	public void add(int a) {
		System.out.println(a*a);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Vishisht obj = new Vishisht();
		obj.sharma(10);
		obj.sharma(10,20);
		Child obj2 = new Child();
		obj2.add(10);
		obj2.sharma(10,20);
	}
}
