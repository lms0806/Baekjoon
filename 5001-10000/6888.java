import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = x; i <= y; i += 60) {
			sb.append("All positions change in year ").append(i).append("\n");
		}
		System.out.print(sb);
	}
}
