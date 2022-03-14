import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] arr = new String[4];
		
		for(int i = 0; i < 4; i++) {
			arr[i] = String.format("%04d", Integer.parseInt(Integer.toBinaryString(s.charAt(i) - '0')));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			sb.append(print(arr[0].charAt(i))).append(print(arr[1].charAt(i))).append("  ").append(print(arr[2].charAt(i))).append(print(arr[3].charAt(i)).trim()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(char c) {
		return c == '1' ? "* " : ". ";
	}
}
