import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	   int n = Integer.parseInt(br.readLine());
	   int [] a = new int[n];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   for(int i = 0; i < n; i++ ){
	       a[i] = Integer.parseInt(st.nextToken());
	   }

       br.close();
    
       int [] aa = a.clone();
       Arrays.sort(aa);
       boolean [] check = new boolean[n];

       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               if(check[j]){
                   continue;
               }else if(a[i] == aa[j]){
                   System.out.print(j + " ");
                   check[j] = true;
                   break;
               }
           }
       }
       
	}
}
