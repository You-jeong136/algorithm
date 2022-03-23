import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
        br.close();
        int group = 0;
        int max = 1; 
        do{
            group++;
            max = group * (group + 1) / 2;
        } while(max < input);

        int now = max - group + 1;
        if(group % 2 == 0){
            for(int n = group, m = 1; n > 0; n--, m++, now++){
                if(input == now){
                    System.out.println(m + "/" + n);
                    break;
                }
            }
        } else {
            for(int m = group, n = 1; m > 0; n++,m--, now++){
                if(input == now){
                    System.out.println(m + "/" + n);
                    break;
                }
            }
        }
    }
}