import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= x * y; i++) {
        	if(i % x == 0) {
        		sb.append(i % y == 0 ? 3 : 2);
        	}
        	else if(i % y == 0) {
        		sb.append(1);
        	}
        }
        System.out.print(sb);
    }
}
