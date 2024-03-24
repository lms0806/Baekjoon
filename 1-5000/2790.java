import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		int answer = 1;
		int score = arr.get(0) + 1;
		for(int i = 1; i < n; i++) {
			if(arr.get(i) + n >= score) {
				answer++;
			}
			
			score = Math.max(score, arr.get(i) + i + 1);
		}
		System.out.print(answer);
	}
}
