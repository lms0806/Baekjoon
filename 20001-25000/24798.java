import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int l = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        if(l * 26 < w || l > w) {
        	sb.append("impossible");
        }
        else {
        	w -= l;
        	
        	int n = w % l, m = w / l;
        	for(int i = 0; i < l; i++) {
            	sb.append((char)(('a' + m) + (n > 0 ? 1 : 0)));
            	n--;
            }
        }
        System.out.print(sb);
    }
}
