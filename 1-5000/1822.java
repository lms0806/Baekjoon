import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			int num = Integer.parseInt(st.nextToken());
			if(set.contains(num)) {
				set.remove(num);
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>(set);
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}	
}
