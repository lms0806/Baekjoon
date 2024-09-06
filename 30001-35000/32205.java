import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		int answer = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 3; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(set.contains(num)) {
					answer = 1;
					break;
				}
				set.add(num);
			}
			
			if(answer == 1) {
				break;
			}
		}
		
		System.out.print(answer);
	}
}
