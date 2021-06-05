import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long answer = Long.parseLong(br.readLine()) % 8;
		
		System.out.print(answer == 0 ? 2 : answer == 6 ? 4 : answer == 7 ? 3 : answer);
	}
}
