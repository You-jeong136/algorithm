import java.io.*;
import java.util.*;

public class Main
{
    
    static boolean[][] chess;
    static int min = 64;
    
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(
	        new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()); //세로
        int m = Integer.parseInt(st.nextToken()); //가로
        
        chess = new boolean[m][n];
        
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                if(line.charAt(j) == 'B'){
                    chess[j][i] = true;
                } else {
                    chess[j][i] = false;
                }
            }
        }
        
        for(int i = 0; i <= n - 8; i++){
            for(int j = 0; j <= m - 8; j++){
            	getLeast(j, i);
            }
        }
        
        System.out.print(min);
	}
	
	static void getLeast(int m, int n){
	    int cnt = 0;
	    
	    for(int i = 0; i < 8; i++){
	        for(int j = 0; j < 8; j++){
	        	 if ((i+j) % 2 == 0 && chess[i+m][j+n] == true) 
	        		 cnt++;
	             else if ((i+j) % 2 == 1 && chess[i+m][j+n] == false)
	            	 cnt++;
	        }

	    }
	    
	   cnt = Math.min(cnt, 64 - cnt);
	   min = Math.min(min, cnt);
	    
	}
}