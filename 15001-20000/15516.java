import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int[] answer = new int[size];
		for(int i = 1; i < size; i++) {
			int n = 0;
			for(int j = 0; j < i; j++) {
				if(num[i] > num[j]) {
					n++;
				}
			}
			answer[i] = n;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : answer) {
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
