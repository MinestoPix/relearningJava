package tut80;

import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {
	
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("chinese");
		}catch(Exception e){
			System.out.println("error occured");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s", "20 ", "bucky ", "roberts");
	}
	
	public void closeFile(){
		x.close();
	}

}
