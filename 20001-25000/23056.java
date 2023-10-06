import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		ArrayList<String>[] arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			if(num == 0 && name.equals("0")) {
				break;
			}
			
			if(arr[num - 1].size() == k) {
				continue;
			}
			
			arr[num - 1].add(name);
		}
		
		for(int i = 0; i < n; i++) {
			Collections.sort(arr[i], (a, b) -> {
				if(a.length() == b.length()) {
					return a.compareTo(b);
				}
				return a.length() - b.length();
			});
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 2; i++) {
			for(int j = i; j < n; j += 2) {
				for(String s : arr[j]) {
					sb.append(j + 1).append(" ").append(s).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
