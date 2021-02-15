import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			double answer = 0;
			int num = Integer.parseInt(br.readLine());
			while(num-->0) {
				answer += 0.5;
				answer *= 2;
			}
			sb.append((int)answer).append("\n");
		}
		System.out.print(sb);
	}
}
