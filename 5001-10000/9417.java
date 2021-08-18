import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ArrayList<Integer> arr = new ArrayList<>();
			while(st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			int max = 0;
			for(int i = 0; i < arr.size(); i++) {
				for(int j = i + 1; j < arr.size(); j++) {
					max = Math.max(max, GCD(arr.get(i), arr.get(j)));
				}
			}
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int GCD(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}
