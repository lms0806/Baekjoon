import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = 1000 - Integer.parseInt(br.readLine());
		int[] n = {500, 100, 50, 10, 5, 1};
		
		int answer = 0;
		for(int i = 0; i < n.length; i++) {
			answer += num / n[i];
			num %= n[i];
		}
		System.out.print(answer);
	}
}
