import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	
    	StringBuilder sb = new StringBuilder();
    	while(m != 0) {
    		sb.append((char)('A' + (m - 1) % 26));
    		m = (m - 1) / 26;
    	}
    	
    	sb = sb.reverse();
    	System.out.print(String.format("SN %d%s", n, sb.length() > 1 ? sb.toString().toLowerCase() : sb.toString()));
    }
}
