import java.util.*;
import java.io.*;

public class Main
{
    static int [] dp = new int [11];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(
	        new OutputStreamWriter(System.out));
		    
	    int n = Integer.parseInt(br.readLine().trim());
	    dp[1] = 1; dp[2] = 2; dp[3] = 4; 
	    for(int i = 0; i < n; i++){
	        int num = calDp(Integer.parseInt(br.readLine().trim()));
	        bw.write(num + "\n");
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
	
	static int calDp(int num){
	    if(dp[num] != 0) { 
	        return dp[num];
	    } else {
	        dp[num] = calDp(num - 1) + calDp(num - 2) + calDp(num - 3);
	        return dp[num];
	
	    }
    }
}
