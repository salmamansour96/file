package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String [] args) throws IOException {
		
		FileWriter writer=new FileWriter("User input.txt");
	    BufferedWriter b=new BufferedWriter(writer);
		while (true) {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		System.out.println("Enter your word");
	    String word=br.readLine();
	    if (word.equals("stop")==true)
	    {
	    	break;
	    }
	    
	    b.write(word+"\n" );
	    
	    	
	    
	    
	    
	    
	    
		
		
	}
    b.close();		
	}
}
