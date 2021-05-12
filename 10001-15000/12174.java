import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int num = Integer.parseInt(br.readLine());
			String str = br.readLine().replace("I", "1").replace("O", "0");
			
			sb.append("Case #").append(i).append(": ");
			for(int j = 1; j <= num; j++) {
				sb.append((char)Integer.parseInt(str.substring((j-1)*8,j*8), 2));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
