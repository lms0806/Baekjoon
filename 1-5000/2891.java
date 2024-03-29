import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int[] team = new int[n];
		
		Arrays.fill(team, 1);
		
		st = new StringTokenizer(br.readLine());
		while(s --> 0) {
			team[Integer.parseInt(st.nextToken()) - 1]--;
		}
		
		st = new StringTokenizer(br.readLine());
		while(r --> 0) {
			team[Integer.parseInt(st.nextToken()) - 1]++;
		}
		
		for(int i = 0; i < n - 1; i++) {
			if(team[i] == 0 && team[i + 1] == 2) {
				team[i]++;
				team[i + 1]--;
			}
			else if(team[i] == 2 && team[i + 1] == 0) {
				team[i]--;
				team[i + 1]++;
			}
		}
		
		int answer = 0;
		for(int t : team) {
			if(t == 0) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
