import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> set = new TreeSet<>(),answer = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(set.contains(num)) {
				answer.add(num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		for(int a : answer) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
