import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(new String[] {"2024 8", "2025 3", "2025 10", "2026 5", "2026 12"}[Integer.parseInt(br.readLine()) - 1]);
	}
}
