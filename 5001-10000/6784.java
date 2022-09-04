import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[] ch = new char[n];
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().charAt(0);
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(ch[i] == br.readLine().charAt(0)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
