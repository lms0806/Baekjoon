import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[n + 1];
		for(int i = 2; i * i <= n; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		for(int i = 2; i <= n; i++) {
			if(!prime[i]) {
				arr.add(i);
			}
		}
		
		int s = 0, e = 0;
		int sum = arr.get(e);
		int answer = 0;
		while(e < arr.size()) {
			if(sum <= n) {
				if(sum == n) {
					answer++;
				}
				e++;
				if(e < arr.size()) {
					sum += arr.get(e);
				}
			}
			else if(sum > n) {
				sum -= arr.get(s++);
			}
		}
		System.out.print(answer);
	}
}
