import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int num;
		
		StringBuilder sb = new StringBuilder();
		while(n-->0) {
			num = Integer.parseInt(br.readLine());
			while(num-->0) {
				sb.append("=");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
