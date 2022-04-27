import java.util.*;
import java.io.*;

public class Main
{
    //{ A C G T }
    
    static int [] isPw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int s = Integer.parseInt(st.nextToken());
	    int p = Integer.parseInt(st.nextToken());
	    
	    String dna = br.readLine();
	    int cnt = 0;
	    
	    st = new StringTokenizer(br.readLine(), " ");
	    int [] acgt = new int[4];
	    
	    for(int i = 0; i < 4; i++){
	        acgt[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    br.close();
	    
	    //초기 값 setting
        isPw = new int[4];
	    for(int i = 0; i < p; i++){
	        char temp = dna.charAt(i);
	        plusPw(temp);
	    }
	    
	    if(checkPw(acgt))
	        cnt++;
	        
        for(int i = p; i < s; i++){
            char subC = dna.charAt(i - p);
            char addC = dna.charAt(i);
            
            plusPw(addC);
            subPw(subC);
            
            if(checkPw(acgt))
                cnt++;
        }
        
        System.out.print(cnt);
	    
	}
	
	static boolean checkPw(int [] acgt){
	    for(int i = 0; i < 4; i++){
	        if(isPw[i] < acgt[i])
	            return false;
	    }
	    return true;
	}
	
	static void plusPw(char c){
	    switch(c) {
            case 'A' :
                isPw[0]++;
                break;
            case 'C' : 
                 isPw[1]++;
                break;
             case 'G' : 
                 isPw[2]++;
                break;
             case 'T' : 
                 isPw[3]++;
                break;
        }
	}
	
	static void subPw(char c){
	    switch(c) {
            case 'A' :
                isPw[0]--;
                break;
            case 'C' : 
                 isPw[1]--;
                break;
             case 'G' : 
                 isPw[2]--;
                break;
             case 'T' : 
                 isPw[3]--;
                break;
        }
	 
	}
}
