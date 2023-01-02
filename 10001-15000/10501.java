import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int max = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		while((s = br.readLine()) != null) {
			arr.add(s.length());
			max = Math.max(max, s.length());
		}
		
		int sum = 0;
		for(int i = 0; i < arr.size() - 1; i++) {
			sum += Math.pow(max - arr.get(i), 2);
		}
		System.out.print(sum);
	}
}
