import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        br.close();
        
        int start = 1, end = 1;
        int sum = 1, cnt = 1;
        while(start + end <= n){
            //System.out.println(start + " ~ " + end + " = " + sum);
            if(sum < n){
                end++;
                sum += end;
            } else {
                if(sum == n){
                    cnt++;
                }
                sum -= start;
                start++;
            } 
        }
        
        System.out.println(cnt);
        
	}
}
