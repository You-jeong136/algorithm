import java.util.*;
import java.io.*;

public class Main
{ 
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
        Stack<Integer> stack = new Stack<>();
	    for(int i = 0; i < n; i++){
	        String [] cmd = br.readLine().split(" ");
	        switch(cmd[0]){
	            case "push" : 
	                stack.push(Integer.parseInt(cmd[1]));
	                break;
                case "pop" : 
                    if(stack.size() == 0)
                        bw.write("-1\n");
                    else 
                        bw.write(stack.pop() + "\n");
                    break;
                case "top" :
                     if(stack.size() == 0)
                        bw.write("-1\n");
                     else 
                        bw.write(stack.peek() + "\n");
                    break;
                case "size" : 
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" :
                    if(stack.empty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
	        }
	    }
	    
	    br.close();
	    bw.flush();
	    bw.close();
	}
}