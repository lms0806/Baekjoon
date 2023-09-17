import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        int answer = 0;
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int num = Integer.parseInt(st.nextToken());
        	
        	answer += num == 136 ? 1000 : num == 142 ? 5000 : num == 148 ? 10000 : 50000;
        }
        System.out.print(answer);
    }
}
