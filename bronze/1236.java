import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] nums = br.readLine().split(" ");
	    int n = Integer.parseInt(nums[0]);
	    int m = Integer.parseInt(nums[1]);
	    
	    int rCnt = n, cCnt = m;
	    boolean[] row = new boolean[n];
	    boolean[] col = new boolean[m];

	    for(int i = 0; i < n; i++){
	        String floor = br.readLine();
	        for(int j = 0; j < m; j++){
	            if(floor.charAt(j) == 'X'){
	                if(!row[i]){
	                    row[i] = true;
	                    rCnt--;
	                }
	                if(!col[j]){
	                    col[j] = true;
	                    cCnt--;
	                }
	            }
	        }
	    }
	    br.close();
	    System.out.println(rCnt > cCnt ? rCnt : cCnt);
	}
}
