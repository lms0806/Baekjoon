import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        
        String answer = "No";
        while(t --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
        	int xx = Integer.parseInt(st.nextToken()), yy = Integer.parseInt(st.nextToken());
        	
        	if(x <= a && a <= xx && y <= b && b <= yy) {
        		answer = "Yes";
        		break;
        	}
        }
        System.out.print(answer);
    }
}
