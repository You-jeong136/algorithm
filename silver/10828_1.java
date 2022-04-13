import java.util.*;
import java.io.*;

public class Main
{ 
    static ArrayList stack = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    for(int i = 0; i < n; i++){
	        String [] cmd = br.readLine().split(" ");
	        switch(cmd[0]){
	            case "push" : 
	                push(Integer.parseInt(cmd[1]));
	                break;
                case "pop" : 
                    bw.write(pop() + "\n");
                    break;
                case "top" :
                    bw.write(top() + "\n");
                    break;
                case "size" : 
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" :
                    bw.write(empty() + "\n");
                    break;
	        }
	    }
	    
	    br.close();
	    bw.flush();
	    bw.close();
	}
	
	static void push(int n){
	    stack.add(n);
	}
	
	static int pop(){
	    int size = stack.size();
	    return size != 0 ? (int)stack.remove(size -1) : -1;
	}
	
	static int empty(){
	    int size = stack.size();
	    return size == 0 ? 1 : 0;
	}
	
	static int top(){
	    int size = stack.size();
	    return size != 0 ? (int)stack.get(size -1) : -1;
	}
	
}