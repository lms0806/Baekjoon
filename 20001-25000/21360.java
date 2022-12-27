import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		int answer = Integer.MAX_VALUE;
		int num = -1;
		for(int i = 0; i < s.length(); i++) {
			if(num == -1 && s.charAt(i) == '.') {
				num = i;
			}
			else if(num != -1 && s.charAt(i) == '.'){
				answer = Math.min(answer, i - num - 1);
				num = i;
			}
		}
		System.out.print(answer);
	}
}
