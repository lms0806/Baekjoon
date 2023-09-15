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
        	
        	int sum = Integer.parseInt(st.nextToken()) * 15;
        	sum += Integer.parseInt(st.nextToken()) * 20;
        	sum += Integer.parseInt(st.nextToken()) * 25;
        	
        	sb.append(sum < 5000 ? "impossible" : (int)(Math.ceil((9000 - sum) / 40.0))).append("\n");
        }
        System.out.print(sb);
    }
}
