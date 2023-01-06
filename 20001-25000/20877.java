import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	
        	answer += num > 7 ? 7 : num;
        	answer -= i % 2 == 0 ? 2 : 3;
        }
        System.out.print(answer);
    }
}
