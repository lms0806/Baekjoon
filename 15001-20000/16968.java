import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int answer = 1, num = 0;
		for(char ch : str.toCharArray()) {
			answer *= ch == 'd' ? num == 1 ? 9 : 10 : num == 2 ? 25 : 26;
			num = ch == 'd' ? 1 : 2;
		}
		System.out.print(answer);
	}
}
