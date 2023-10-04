import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			int sum = -n;
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 1; i < Math.sqrt(n); i++) {
				if(n % i == 0) {
					sum += i + (n / i);
					
					arr.add(i);
					arr.add(n / i);
					
					if(sum > n) {
						break;
					}
				}
			}
			
			Collections.sort(arr);
			
			sb.append(n);
			if(sum == n) {
				sb.append(" = ");
				for(int i = 0; i < arr.size() - 1; i++) {
					sb.append(arr.get(i));
					
					if(i < arr.size() - 2) {
						sb.append(" + ");
					}
				}
			}
			else {
				sb.append(" is NOT perfect.");
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
