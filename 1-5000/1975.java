import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int answer = 0;
        	for(int i = 2; i <= n; i++) {
        		int num = n;
        		
        		while(num % i == 0) {
        			answer++;
        			num /= i;
        		}
        	}
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
