import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size % 2 == 0) {
			size /= 2;
			answer++;
		}
		
		System.out.print(size + " " + answer);
	}
}
