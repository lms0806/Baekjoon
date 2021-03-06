import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String line = br.readLine();
		
		int answer = 10;
		for(int i = 1; i < line.length(); i++) {
            		answer += line.charAt(i-1) == line.charAt(i) ? 5 : 10;
		}
		System.out.print(answer);
	}
}
