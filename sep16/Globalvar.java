package sep16;
class Parent{
	int a = 10;
}
class Child extends Parent{
	int c = a * 10;
}
public class Globalvar {
	public static void main(String[] args) {
		Parent obj=new Parent();
		Child obj2=new Child();
		System.out.println(obj.a);
		System.out.println(obj2.c);
		System.out.println(obj2.a);
	}
}
