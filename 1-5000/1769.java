import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int answer = 0, last = 0;
		while(str.length() != 1) {
			for(char ch : str.toCharArray()) {
				last += ch - '0';
			}
			str = Integer.toString(last);
			last = 0;
			answer++;
		}
		
		System.out.println(answer);
		System.out.print(Integer.parseInt(str) % 3 == 0 ? "YES" : "NO");
	}
}
