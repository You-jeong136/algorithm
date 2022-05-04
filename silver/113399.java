import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int [] p = new int[n];
	   
	    for(int i = 0; i < n; i++){
	        p[i] = Integer.parseInt(st.nextToken());
	    }
	    
	  Arrays.sort(p);
	    int answer = 0;
	    for(int i = 0; i < n; i++){
	       answer += (n - i) * p[i];
	    }
	    
	    System.out.print(answer);
	    
	}
}