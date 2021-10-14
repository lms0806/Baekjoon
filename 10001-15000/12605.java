import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			String[] str = br.readLine().split(" ");
			
			sb.append("Case #").append(i).append(": ");
			for(int j = str.length - 1; j >= 0; j--) {
				sb.append(str[j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
