package aug26;

class Pri{
	private int p = 10;

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
		this.pmethod();
	}
	
	private void pmethod() {
		System.out.println("Hello from private method.");
	}
}

public class Encap {
	public static void main(String[] args) {
		Pri pri=new Pri();
		System.out.println(pri.getP());
		pri.setP(12);
		System.out.println(pri.getP());
		
	}

}
