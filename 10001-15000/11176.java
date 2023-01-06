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
        	int e = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	
        	int answer = 0;
        	while(n --> 0) {
        		if(Integer.parseInt(br.readLine()) > e) {
        			answer++;
        		}
        	}
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
