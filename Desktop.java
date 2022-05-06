package week3.day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size from the computer");
	}

	public static void main(String[]args) {
		Desktop details = new Desktop();
		details.computerModel();
		details.desktopSize();
		
	}
}
