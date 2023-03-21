import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"};
		
		int n = Integer.parseInt(br.readLine()) - 1;
		
		String answer = str[n % str.length];
		
		answer = answer.contains("tur") ? answer + "ru".repeat(n / str.length) : answer;

		System.out.print(answer.contains("tur") && answer.length() >= 12 ? "tu+ru*" + (answer.length() - 2) / 2 : answer);
	}
}
