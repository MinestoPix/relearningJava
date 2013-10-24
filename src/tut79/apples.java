package tut79;

import java.util.*;

public class apples {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try{
			x = new Formatter("fred.txt");
			System.out.println("file created");
		}catch(Exception e){
			System.out.println("you got an error");
		}
		
	}
	
}
