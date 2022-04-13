import java.util.*;
import java.io.*;

public class Main
{ 
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] wish = new int [m];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i = 1; i <= n; i++){
		      if(i <= m){
		        wish[i - 1] = Integer.parseInt(st.nextToken());
		    }
	        deque.offer(i);
		}
		int total = 0;
		for(int i = 0; i < m; i++){
		   int cnt = 0;
		   while(deque.peek() != wish[i]){
		       deque.offer(deque.poll());
		       cnt++;
		   }
		   total += (cnt < deque.size() - cnt ? cnt : deque.size() - cnt);
		   deque.poll();
		}
		
		System.out.print(total);
	}
}