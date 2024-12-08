import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        
        int size = 1 << (n - m);
        
        String answer = "";
        for(int i = 0; i < (1 << n); i += size) {
        	String str = s.substring(i, i + size);
        	
        	if(answer.compareTo(str) < 0) {
        		answer = str;
        	}
        }
        
        System.out.print(answer);
    }
}
