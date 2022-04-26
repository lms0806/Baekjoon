import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print((change(br.readLine(), 2) + change(br.readLine(), 2)) * change(br.readLine(), 3));
	}
	
	public static long change(String s, int n) {
		long answer = 1;
		for(int i = 0; i < n; i++) {
			answer *= Long.parseLong(s.split(" ")[i]);
		}
		return answer;
	}
}
