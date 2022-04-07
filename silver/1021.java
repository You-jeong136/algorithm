import java.util.*;
import java.io.*;
import java.lang.Math;

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
		
		ArrayList deque = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++){
		    if(i <= m){
		        wish[i - 1] = Integer.parseInt(st.nextToken());
		    }
	        deque.add(i);
		}
		
		int com = 0, cnt = 0;
		while(com != m){
		    //System.out.println(wish[com] + " , " + deque.get(0) +" ");
		    
		    if(deque.get(0).equals(wish[com])){
		        deque.remove((int)0);
		        com++;
		        //System.out.println("1" + deque);

		    } else {
		        int target = deque.indexOf(wish[com]);
		        int half = deque.size() / 2 ;
		        
		        if(target <= half){
		            for(int i = 0; i < target; i++){
    		            int front1 = Integer.parseInt(deque.remove((int) 0).toString());
    		            deque.add(front1);
    		            //System.out.println("2" + deque);
    		            cnt++;
		            }
		        } else {
		            for(int i = 0; i < deque.size() - target; i++){
    		            int rear =  Integer.parseInt(deque.remove((deque.size() - 1)).toString());
    		            deque.add(0, rear);
    		            //System.out.println("3" + deque);
    		            cnt++;
                    }
		        }
		    }
		    
		}
		
		System.out.print(cnt);
	}
}