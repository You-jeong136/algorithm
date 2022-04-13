import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    int cnt = 0;
	    for(int i = 1; i <= n; i++){
	        boolean flag = isHan(String.valueOf(i));
	        if(flag){
	            cnt++;
	        }
	    }
	    
	    System.out.println(cnt);
	    
	}
	
	static boolean isHan(String str){
	    int len = str.length();
	    if(len < 3 )
	        return true;
	    else {
	        int sub = str.charAt(0) - str.charAt(1);
	        for(int i = 1; i < len - 1; i++){
	            if(sub != str.charAt(i) - str.charAt(i + 1)){
	                return false;
	            }  
	        }
	    }
	    return true;
	}
	
}
