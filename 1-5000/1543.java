import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine(), b = br.readLine();
		
		int answer = 0;
		while(a.contains(b)) {
			answer++;
			a = a.substring(a.indexOf(b) + b.length());
		}
		System.out.print(answer);
	}
}
