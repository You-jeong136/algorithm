import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] input = new int[5];
	    for(int i = 0; i < 5; i++){
	        input[i] = sc.nextInt();
	    }
	    
	    int temp = 1;
	    while(true){
	        int cnt = 0;
	        for(int i = 0; i < 5; i++){
	            if(temp % input[i] == 0){
	                cnt++;
	            }
	        }
	        
	        if(cnt >= 3){
	            break;
	        }
	        temp++;
	    }
	    
	    System.out.print(temp);
	    
	}
}