import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		int answer1 = num * 78 / 100;
		int answer2 = num * 8 / 10 + num * 2 / 10 * 78 / 100;
		
		System.out.println(answer1 + " " + answer2);
	}
}
