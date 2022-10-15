package org.system;

public class Desktop extends Computer
{
 public void desktopSize()
 {
	 System.out.println("desktopSize");
 }
 
 public static void main(String[] args) 
 {
	 Computer cm= new Computer();
	 Desktop ds = new Desktop();
	 ds.desktopSize();
	 
	 System.out.println("\n"+"----------------"+"\n");
	 cm.computerModel();
	 
 }
}
