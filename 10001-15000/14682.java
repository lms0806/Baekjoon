import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		
		int answer = n;
		while(size --> 0) {
			n *= 10;
			answer += n;
		}
		System.out.print(answer);
	}
}
