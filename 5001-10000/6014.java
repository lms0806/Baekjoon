import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			
			while(num --> 0) {
				arr.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			sb.append(arr.get(Integer.parseInt(br.readLine().trim()))).append("\n");
		}
		System.out.print(sb);
	}
}
