import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String s = st.nextToken();
        	map.put(st.nextToken(), s);
        }
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String s = st.nextToken();
        	for(String str : map.keySet()) {
        		if(map.get(str).equals(s)) {
        			map.put(str, st.nextToken());
        			break;
        		}
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : map.keySet()) {
        	sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.print(sb);
    }
}
