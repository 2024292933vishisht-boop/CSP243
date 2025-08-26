package three;

public class User {
	public static void main(String[] args) {
		System.out.println("Main Block");
		User obj = new User();
		obj.add(10,20);
		obj.sub(10,20);
		obj.mul(10,20);
		obj.div(10,20);
	}
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
	public void div(float a, float b) {
		System.out.println(a / b);
	}
}
