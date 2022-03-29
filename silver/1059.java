import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
	        new InputStreamReader(System.in));
	   
	    int len = Integer.parseInt(br.readLine().trim());
	    int [] arr = new int[len];
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    
	    int idx = 0;
	    while(st.hasMoreTokens()){
	        arr[idx] = Integer.parseInt(st.nextToken());
	        idx++;
	    }
	    
	    int n = Integer.parseInt(br.readLine().trim());
	    br.close();
	    
	    Arrays.sort(arr);
	    
	    int start = 0;
	    int end = 0;
	   
	    for(int i = 0; i < len; i++){
	      if(arr[i] > n){
	          if(i > 0 && arr[i] > arr[i - 1]){
	              start = arr[i - 1];
	          } 
	          end = arr[i];
	          break;
	      }
	    }
	    if(start == 0 && end == 0){
	        System.out.print("0");
	        return;
	    }
	    
	    int cnt = 0;
	    for(int i = start + 1; i <= n; i++){
	        for(int j = n; j < end; j++){
	            if(i == n && j == n){
	                continue;
	            }
	            cnt++;
	        }
	    }
	    
	    System.out.print(cnt);
	    
	}
}
