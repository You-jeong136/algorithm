import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    String[] arr = new String[N];
	    
	    for(int i = 0; i < N; i++){
	        arr[i] = scan.next();
	    }
	    
	    
	    boolean isSame = true;
	    
	    for(int i = 0; i < arr[0].length(); i++ ){
	        isSame = true;
	        
	        for(int j = 0; j < N - 1; j++){
	            
	            if(arr[j].charAt(i) != arr[j + 1].charAt(i)){
	              isSame = false; 
	              break;
	            }
	            
	        }
	        
	        if(isSame){
	            System.out.print(arr[0].charAt(i));
	        }else {
	            System.out.print('?');
	        }
	    }
	    
	    scan.close();
	}
}
