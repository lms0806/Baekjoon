import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] answer = {"ABCDEFGHJLM", "ACEFGHILM", "ACEFGHILM", "ABCEFGHLM", "ACEFGHLM", "ACEFGHLM", "ACEFGHLM", "ACEFGHLM", "ACEFGHLM", "ABCFGHLM"};
		
		int n = Integer.parseInt(br.readLine()) - 1;
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer[n].length()).append("\n");
		for(char c : answer[n].toCharArray()) {
			sb.append(c).append(" ");
		}
		System.out.print(sb);
	}
}
