import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			set.add(num);
			sum += num;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(set.size()).append("\n");
		for(int num : set) {
			sb.append(sum - num).append(" ");
		}
		System.out.print(sb);
		
	}
}
