package org.system;

public class Desktop extends Computer {

	public void desktopSize()  {
		System.out.println("desktopSize");
	}
	
	public void desktopColour()  {
		System.out.println("Black");
	}
	
	public void desktopName() {
		System.out.println("Acer");
	}
	
	public static void main(String[] args) {
		Desktop hp=new Desktop();
		hp.computermodel();
		hp.openwindows();
		hp.ClickMyComputer();
		hp.desktopColour();
		hp.desktopName();
		hp.desktopSize();
	}
}
