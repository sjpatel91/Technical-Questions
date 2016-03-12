import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char c;
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
	    s = sc.next();
	    for(int i=0;i<(s.length());i++){
	    	
	    	c=s.charAt(i);
	    
	    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	    		System.out.println("vowels"+c);
	    		
	    	}
	    }
	    for(int i=0;i<(s.length());i++){
	    	
	    	c=s.charAt(i);
	    
	    	if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u'){
	    	
	    	
	    		System.out.println("consonants"+c);
	    	}
	    		
	    }
	}

}
