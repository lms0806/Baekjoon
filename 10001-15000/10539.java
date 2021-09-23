import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken()) * (i + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(num[0]).append(" ");
		for(int i = 1; i < size; i++) {
			sb.append(num[i] - num[i - 1]).append(" ");
		}
		System.out.print(sb);
	}
}
