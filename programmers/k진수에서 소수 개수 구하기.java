import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int k) {        
        int cnt = 0;
	    long kNum = getKNumber(n, k);
	    
	    StringTokenizer st = new StringTokenizer(String.valueOf(kNum), "0");
        
        while(st.hasMoreTokens()){
            if(isPrime(Long.parseLong(st.nextToken()))){
                cnt++;
            }
        }       
               
        return cnt;
    }
    
    static long getKNumber(int n, int k){
        if(n < k || k == 10){
            return n;
        } 
        
        int q = n, r = 0, cnt = 0;
        long rslt = 0;
        while (q != 0){
            r = q % k;
            q = q / k;
            
            rslt += r * Math.pow(10, cnt);
            cnt++;
        }
        
        return rslt;
    }
    
    static boolean isPrime(long n){
        if(n == 1){
            return false;
        }
        
        double sqrt = Math.sqrt(n);
        
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}