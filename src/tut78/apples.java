package tut78;

import java.io.File;

public class apples {
	
	public static void main(String[] args) {
		
		File x = new File("/home/minestopix/Eclipse/Relearning java workspace/Relearning Java/README");
		
		if(x.exists())
			System.out.println(x.getName() + " exists!");
		else
			System.out.println("this file does not exist");
		
		
	}

}
