import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(
	        new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine().trim());
        String [] arr = br.readLine().split(" ");
        int []div = new int [cnt];
        
        for(int i = 0; i < cnt; i++){
            div[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(div);
        
        System.out.print(div[0] * div[cnt - 1 ]);
        
        
	}
}
