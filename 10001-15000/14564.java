import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken()) - 1;
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	int num = Integer.parseInt(br.readLine());
        	
        	if(num == m / 2 + 1) {
        		sb.append(0);
        		break;
        	}
        	
        	a = (n + a + num - m / 2 - 1) % n;
        	
        	sb.append(a + 1).append("\n");
        }
        System.out.print(sb);
    }
}
