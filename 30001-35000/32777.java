import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	sb.append((b - a + 43) % 43 < (a - b + 43) % 43 ? "Inner circle line" : "Outer circle line").append("\n");
        }
        System.out.print(sb);
    }
}
