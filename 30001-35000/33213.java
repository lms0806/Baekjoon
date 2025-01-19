import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> odd = new HashSet<>(), even = new HashSet<>();
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num % 2 == 0) {
				even.add(num);
			}
			else {
				odd.add(num);
			}
		}		
		System.out.print(odd.size() < even.size() ? solve(even, 2) : solve(odd, 1));
	}
	
	public static int solve(HashSet<Integer> set, int answer) {
		while(true) {
			if(!set.contains(answer)) {
				return answer;
			}
			answer += 2;
		}
	}
}
