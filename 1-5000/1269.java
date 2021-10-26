import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			int num = Integer.parseInt(st.nextToken());
			if(set.contains(num)) {
				set.remove(num);
			}
			else {
				answer++;
			}
		}
		System.out.print(set.size() + answer);
	}	
}
