import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++) {
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb);
	}
}
