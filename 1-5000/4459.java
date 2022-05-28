import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int n = Integer.parseInt(br.readLine());
       
       String[] str = new String[n + 1];
       for(int i = 1; i <= n; i++) {
    	   str[i] = br.readLine();
       }
       
       int t = Integer.parseInt(br.readLine());
       
       StringBuilder sb = new StringBuilder();
       while(t --> 0) {
    	   int num = Integer.parseInt(br.readLine());
    	   
    	   sb.append("Rule ").append(num).append(": ").append(num < 1 || num > n ? "No such rule" : str[num]).append("\n");
       }
       System.out.print(sb);
    }
}
