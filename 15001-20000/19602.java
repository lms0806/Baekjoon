import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = Integer.parseInt(br.readLine()) * 1 + Integer.parseInt(br.readLine()) * 2 + Integer.parseInt(br.readLine()) * 3;
		
		System.out.print(answer >= 10 ? "happy" : "sad");
	}
}
