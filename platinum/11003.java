import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int n = Integer.parseInt(st.nextToken());
	    int l = Integer.parseInt(st.nextToken());
	    
	    st = new StringTokenizer(br.readLine(), " ");
	    
	    Deque<Node> deq = new ArrayDeque<>();
	    for(int i = 0; i < n; i++){
	        int now = Integer.parseInt(st.nextToken());
	        
	        while(!deq.isEmpty() && deq.getLast().value > now){
    	        deq.removeLast();
    	    }
	        deq.addLast(new Node(i, now));
            
            if(deq.getFirst().idx < i - l + 1){
	            deq.removeFirst();
	        }
	       
	        bw.write(deq.getFirst().value + " ");
	    }
        bw.flush();
        bw.close();
        br.close();
	}
    static class Node {
        int idx;
        int value;

        Node(int idx, int value){
            this.idx = idx;
            this.value = value;
        }
    }
}