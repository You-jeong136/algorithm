import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) continue;
            
            boolean flag = true;
            double sqrt = Math.sqrt(num);
	        
	        for(int j = 2; j <= sqrt; j++){
    	        if(num % j == 0){
    	            flag = false;
    	            break;
    	        }
	        }
	        
	        if(flag) 
	            cnt++;
	    
        }
        
        System.out.print(cnt);
	    
	}
}