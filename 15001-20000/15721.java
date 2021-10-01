import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int a, int t, int check) {
		int round = 0, count = 0, answer = 0;
		while(true) {			
			round++;
			ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 0, 1));
			
			for(int i = 1; i <= round + 1; i++) {
				arr.add(0);
			}
			for(int i = 1; i <= round + 1; i++) {
				arr.add(1);
			}
			
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i) == check) {
					count++;
				}
				
				if(count == t) {
					return answer;
				}
				
				answer++;
				answer %= a;
			}
			arr.clear();
		}
	}
}
