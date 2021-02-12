import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String answer = "뭐야?";
		while(size-->0) {
			if(br.readLine().equals("anj")) {
				answer = "뭐야;";
				break;
			}
		}
		
		System.out.print(answer);
	}
}
