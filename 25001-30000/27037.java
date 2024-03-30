import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int answer = 0;
		HashSet<Integer> set = new HashSet<>();
		while(!set.contains(num)) {
			set.add(num);
		
			num = (int) Math.pow(num / 10 % 100, 2);
			answer++;
		}
		System.out.print(answer);
	}
}
