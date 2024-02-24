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
		
		ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num < 0) {
				a.add(-num);
			}
			else {
				b.add(num);
			}
		}
		
		Collections.sort(a);
		Collections.sort(b);
		
		long answer = 0;
		for(int i = a.size() - 1; i >= 0; i -= k) {
			answer += a.get(i) << 1;
		}
		for(int i = b.size() - 1; i >= 0; i -= k) {
			answer += b.get(i) << 1;
		}
		System.out.print(answer);
	}
}
