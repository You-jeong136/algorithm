import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    int [] sum = new int[n];
	    
	    st = new StringTokenizer(br.readLine(), " ");
	    for(int i = 0; i < n; i++){
	        if(i == 0)
	            sum[i] = Integer.parseInt(st.nextToken());
            else 
                sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
	    }
	    
	    for(int i = 0; i < m; i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        int start = Integer.parseInt(st.nextToken()) - 1;
	        int end = Integer.parseInt(st.nextToken()) - 1;
	        
	        if(start == 0){
	            sb.append(sum[end] + "\n");
	        }else {
	            sb.append(sum[end] - sum[start - 1] + "\n");
	        }
	    }
	     br.close();
 
	    System.out.println(sb);
	}
}