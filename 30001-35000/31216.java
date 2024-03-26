import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < 1000001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 1000001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 2; i < 1000001; i++) {
			if(!prime[i]) {
				arr.add(i);
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(arr.get(arr.get(Integer.parseInt(br.readLine()) - 1) - 1)).append("\n");
		}
		System.out.print(sb);
	}
}
