import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    
	    double [] pos = new double[6];
	    
	    for(int i = 0; i < 6; i++){
	        pos[i] = Double.parseDouble(st.nextToken());
	    }
	    
	    double answer = -1;
	    if(isNever(pos)){
	        System.out.println(answer);
	        return;
	    }
	    
	    answer = getRoundSub(pos);
	    System.out.println(answer);
	}
	
	static boolean isNever(double[] pos) {
	   // 세점이 한 직선 위에 있을 때. = 두변의 기울기를 구했을 때 기울기가 같다면.
	   if(pos[2] == pos[0] || pos[4] == pos[0]){
	       if(pos[2] == pos[0] && pos[4] == pos[0]){
	            return true;
	       }
	   }
	   if( (pos[3] - pos[1]) / (pos[2] - pos[0])  == (pos[5] - pos[1]) / (pos[4] - pos[0])){
	        return true;
	   }
	   
	   return false;
	
	}
	
	static double getRoundSub (double pos[]){
	    double [] abc = new double[3];
	    abc[0] =  Math.sqrt(Math.pow(pos[2] - pos[0], 2) + Math.pow(pos[3] - pos[1], 2));
        abc[1] =  Math.sqrt(Math.pow(pos[4] - pos[0], 2) + Math.pow(pos[5] - pos[1], 2));
        abc[2] =  Math.sqrt(Math.pow(pos[4] - pos[2], 2) + Math.pow(pos[5] - pos[3], 2));
	 
	    Arrays.sort(abc);
	    
	    return (abc[2] - abc[0]) * 2;
	       
	}
}
