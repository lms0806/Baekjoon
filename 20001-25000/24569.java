import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(br.readLine()) * 5 - Integer.parseInt(br.readLine()) * 3 > 40) {
				answer++;
			}
		}
		
		System.out.print(answer + (answer == n ? "+" : ""));
	}
}
