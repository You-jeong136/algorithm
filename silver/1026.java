import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		
		int [] a = new int[n];
		int [] b = new int[n];
		
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++){
		  a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++){
		  b[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int rslt = 0;
		for(int i = 0; i < n; i++){
		    //System.out.println(a[i] + " * " + b[n - 1 -i]);
		    rslt += (a[i] * b[n - 1 - i]);
		}
		
		System.out.print(rslt);
		
	}
}