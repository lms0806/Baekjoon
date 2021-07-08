import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		var size = Integer.parseInt(br.readLine());
		int[] num = new int[size];
		
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(num[i]).append("\n");
		}
		System.out.print(sb);
	}
}
