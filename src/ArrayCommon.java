import java.util.Scanner;


public class ArrayCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]=new char[10];
		char b[]=new char[10];
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    a=s1.toCharArray();
	    String s2=sc.next();
	    b=s2.toCharArray();
	    for(int i=0;i<(a.length);i++){
	    	
	    	for(int j=0;j<b.length;j++){
	    		if(a[i]==b[j]){
	    			System.out.println(a[i]);
	    		}
	    	}
	    	
	    }
	    	
	    	

	}

}
