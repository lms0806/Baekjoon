import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken()), height = Integer.parseInt(st.nextToken());
        
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        while(t --> 0) {
        	if(height >= Integer.parseInt(st.nextToken())) {
        		answer++;
        	}
        }
        System.out.print(answer);
    }
}
