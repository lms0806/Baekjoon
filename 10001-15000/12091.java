import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = {"Vaporeon", "Jolteon", "Flareon"};
		
		System.out.print(str[(Integer.parseInt(br.readLine()) + 1) % 3]);
	}
}
