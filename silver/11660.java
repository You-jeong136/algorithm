import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    int [][] sum = new int[n][n];
	    for(int i = 0; i < n; i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        for(int j = 0; j < n; j++){
	            int now = Integer.parseInt(st.nextToken());
	            if(i == 0 && j == 0){
	                sum[i][j] = now;
	            } else if(i == 0){
	                sum[i][j] = now + sum[i][j - 1];
	            } else if(j == 0){
	                sum[i][j] = now + sum[i - 1][j];
	            } else {
	                sum[i][j] = now + sum[i][j-1] + sum[i-1][j] - sum[i -1][j-1];
	            }
	        }
	    }
	    
	    int x1, y1, x2, y2, rslt;
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i = 0; i < m; i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        x1 = Integer.parseInt(st.nextToken()) - 1;
	        y1 = Integer.parseInt(st.nextToken()) - 1;
	        x2 = Integer.parseInt(st.nextToken()) - 1;
	        y2 = Integer.parseInt(st.nextToken()) - 1;
	        
	        if(x1 == 0 && y1 == 0){
	            rslt = sum[x2][y2];
	        } else if(x1 == 0){
	            rslt = sum[x2][y2] - sum[x2][y1 - 1];
	        } else if(y1 == 0){
	            rslt = sum[x2][y2] - sum[x1 -1][y2];
	        } else {
	            rslt = sum[x2][y2] - sum[x1 -1][y2] - sum[x2][y1 - 1] + sum[x1 -1][y1 - 1];
	        }
	        sb.append(rslt + "\n");
	    } 
	    br.close();
	    System.out.println(sb);
	}
}