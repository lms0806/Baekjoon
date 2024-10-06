import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = l; i <= r; i++) {
			set.add(i | x);
		}
		
		int answer = 0;
		for(int a : set) {
			if(answer != a) {
				break;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}
