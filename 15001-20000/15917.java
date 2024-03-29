import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int a = Integer.parseInt(br.readLine());
			sb.append((a & (-a)) == a ? "1" : "0").append("\n");
		}
		System.out.print(sb);
	}
}
