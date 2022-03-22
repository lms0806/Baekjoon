import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()), idx = 1;
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append("Material Management ").append(idx++).append("\nClassification ---- End!\n");
		}
		System.out.print(sb);
	}
}
