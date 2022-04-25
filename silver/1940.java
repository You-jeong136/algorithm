import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());
        
        int [] arr = new int[n];
        String [] temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        br.close();
        
        Arrays.sort(arr);
        int start = 0, end = n - 1;
        int sum = 0, cnt = 0;
        while(start < end){
            sum = arr[start] + arr[end];
            //System.out.println(arr[start] + " + " + arr[end] + " = " + sum);

            if(sum < m){
                start++;
            } else if (sum > m){
                end--;
            }else {
                cnt++;
                start++;
                end--;
            }
            
        }
        
        System.out.println(cnt);
        
	}
}
