
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i<j){
                    System.out.print(" ");
                }
               
                else{
                    System.out.print("#");
                }
            	//System.out.print("#");
               
            }
            System.out.println("\n");
        }
	}
}
