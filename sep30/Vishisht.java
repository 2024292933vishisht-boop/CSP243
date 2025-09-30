package sep30;

public class Vishisht {
	public static void main(String[] args) {
		String user = "Vishisht";
		System.out.println("Enter your name:");
		StringBuilder input = new StringBuilder();
		try {
			for(int i = 0; i < user.length() ; i++) {
				char c = (char) System.in.read();
				input.append(c);
				System.out.print(c);
				if(!user.startsWith(input.toString())) {
					System.out.println("Wrong name entered.");
					return;
				}
			}
			if (input.toString().equals(user)) {
                System.out.println("\n✅ Correct Name");
            } else {
                System.out.println("\n❌ Wrong name entered.");
            }
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
}
