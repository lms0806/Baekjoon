import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String answer = "";
		while(size-->0) {
			answer = size % 2 == 1 ? "7" + answer : "4" + answer;
			size /= 2;
		}
		System.out.print(answer);
	}
}
