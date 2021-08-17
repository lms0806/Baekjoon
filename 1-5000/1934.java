import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		int min = 1;
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int num = Math.min(a, b);

			for(int j = 1; j <= num; j++) {
				if(a % j == 0 && b % j == 0) {
					min = j;
				}
			}
			sb.append(a * b / min).append("\n");
			min = 1;
		}
		System.out.print(sb);
	}
}
