import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			sb.append("Case #").append(i).append(": ");
			String[] str = br.readLine().split(" ");
			
			for(int j = str.length - 1; j >= 0; j--) {
				sb.append(str[j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}	
}
