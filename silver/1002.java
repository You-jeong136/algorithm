import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int []result = new int[n];
	    
	    int [][] xyr = new int[n][6];
	    for(int i = 0; i < n; i++){
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        for(int j = 0; j < 6; j++){
	            xyr[i][j] = Integer.parseInt(st.nextToken());
	        }
	        
	        result[i] = getCaseCnt(xyr[i]);
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.println(result[i]);
	    }
	    
	}
	
	static int getCaseCnt(int[] xyr){
	    //xyr 0 1 2 , xyr 3 4 5
	    int r1 = (xyr[2] > xyr[5])? xyr[5] : xyr[2];
	    int r2 = (xyr[2] > xyr[5])? xyr[2] : xyr[5];
	    
	    double d = Math.sqrt(getDouble(xyr[3] - xyr[0]) + getDouble(xyr[4] - xyr[1]));
	    
	    //System.out.println(r1 + ", " + r2 + ", " + d);
	    if(r1 + r2 == d || (r2 - r1 == d) && d != 0){
	        return 1;
	    } else if( r1 + r2 > d && r2 - r1 < d ){
	        return 2;
	    } else if(r1 == r2){
	        if(d == 0){
	            return -1;
	        }
	    } 
	    return 0;
	}
	
	static int getDouble(int a){
	    return a * a;
	}
	
}
