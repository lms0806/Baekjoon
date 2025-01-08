import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(), b = br.readLine();
		
		int answer = 0;
		for(int i = 0; i <= a.length() - b.length(); i++) {
			boolean flag = true;
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i + j) == b.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
