import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long [] arr = new long[n];
        String [] temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(temp[i]);
        }
        br.close();
        
        Arrays.sort(arr);
        int cnt = 0;
        for(int i = 0; i < n; i++){
            long k = arr[i];
            int start = 0, end = n - 1;
            
            while(start < end ){
                //System.out.println(arr[start] + ", " + arr[end] + ", " + k);
	    // 요점 : 현재 인덱스 i값을 사용해서 k값을 만들어서는 안된다. i 값 이용 시 start++나 end++해서 스루하자. 
	    //나머지는 기본 투포인트.
                if(arr[start] + arr[end] == k){
                    if(start != i && end != i){
                        cnt++;
                        break;
                    } else if(start == i){
                        start++;
                    } else if(end == i) {
                        end--;
                    }
                }
                else if(arr[start] + arr[end] < k){
                    start++;
                } else {
                    end--;
                }
            }

        }
    
        System.out.println(cnt);
        
	}
}