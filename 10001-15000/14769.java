import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			try {
				map.put(Integer.parseInt(a), b);
			}
			catch(Exception e){
				map.put(Integer.parseInt(b) * 2, a);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Integer key : map.keySet()) {
			sb.append(map.get(key)).append("\n");
		}
		System.out.print(sb);
	}
}
