import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
	    int[] six = new int[m];
	    int[] one = new int[m];
	    for(int i = 0; i < m; i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        six[i] = Integer.parseInt(st.nextToken());
	        one[i] = Integer.parseInt(st.nextToken());
            if(i == m - 1){
                br.close();
            }
	    }
	    
	    Arrays.sort(six);
	    Arrays.sort(one);
	 
	    System.out.print(cal(n, six[0], one[0]));
	    
	}
	
	static int cal(int n, int six, int one){
	   
        int q = n / 6; int r = n % 6;
        
        if(six > one * 6){
            return n * one;
        } else if(six < one * r){
            return (q + 1) * six;
        } else {
            return (q * six) + (r * one);
        }
	    
	}
}