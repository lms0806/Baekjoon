import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < n; i += n / 10) {
			if(s.substring(i, i + n / 10).replaceAll("N", "").length() >= n / 10) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
