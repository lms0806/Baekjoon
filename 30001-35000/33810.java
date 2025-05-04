import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String s = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != "SciComLove".charAt(i)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
