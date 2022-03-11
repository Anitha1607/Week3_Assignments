package org.system;

public class Desktop extends Computer {////single inheritance
	
	
	public void DesktopSize() {
		
		System.out.println("The size of the desktop model is FLAT");
	}

	
	
	public static void main(String[] args) {
		
		Desktop dt =new Desktop();
		dt.computerModel();
		dt.DesktopSize();
		
		
		
	}

}
