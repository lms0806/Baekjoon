import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i <= size; i++) {
			for(int j = i; j <= size; j++) {
				answer += i + j;
			}
		}
		System.out.print(answer);
	}
}
