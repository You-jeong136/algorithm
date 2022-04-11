import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
	        new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int [] score = new int[n];
        
        int sum = 0, high = -1;
        String[] scr = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            score[i] = Integer.parseInt(scr[i]);
            sum += score[i];
            
            if(high < score[i])
                high = score[i];
        }
        
        double avg = sum * 100.0 / high / n; 
        
        System.out.print(avg);
	}
}