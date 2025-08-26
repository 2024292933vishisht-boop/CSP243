package aug12;

class One{
	public One() {
		hello();
	}
	public void hello() {
		System.out.println("Hello World!");
	}
}

class Two{
	public Two() {
		One obj = new One();
	}
}
public class ClassMethod {
	public static void main(String[] args) {
		Two obj1 = new Two();
	}

}
