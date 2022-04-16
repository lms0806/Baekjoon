import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int count = 0;
			for(int j = 1; j * j * j <= 2000000000; j++) {
				if(a <= j * j * j && j * j * j <= b) {
					count++;
				}
			}
			sb.append("Case #").append(i).append(": ").append(count).append("\n");
		}
		System.out.print(sb);
	}
}
