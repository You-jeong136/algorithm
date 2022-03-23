import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in));
	    
	    char[] input = br.readLine().toCharArray();
        br.close();
	    int [] arr = new int[26];
	    
	    for(int i = 0; i < input.length; i++){
	        if(input[i] > 91)
                arr[input[i] - 97]++;
            else 
                arr[input[i] - 65]++;
	    }
	    
	    int max = -1;
	    int index = -1;
	    
	    for(int i = 0; i < 26; i++){
	          if(max == arr[i]){
	            index = -1;
	        }
	        
	        if(max < arr[i]){
	            max = arr[i];
	            index = i;
	        }
	        
	    }
	    if(index == -1){
	        System.out.println("?");
	    }else {
    	    System.out.print((char)(index + 65));
	    }
    }
}
