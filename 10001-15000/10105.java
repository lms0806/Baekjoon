import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] a = new String[n], b = new String[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = st.nextToken();
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b[i] = st.nextToken();
		}
		
		HashMap<String, String> map = new HashMap<>();
		
		String answer = "good";
		for(int i = 0; i < n; i++) {
			if(a[i].equals(b[i])) {
				answer = "bad";
				break;
			}
			else if(map.containsKey(b[i])) {
				if(!map.get(b[i]).equals(a[i])) {
					answer = "bad";
					break;
				}
			}
			else {
				map.put(a[i], b[i]);
			}
		}
		System.out.print(answer);
	}
}
