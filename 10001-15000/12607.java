import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			sb.append("Case #").append(t).append(": ").append(solve(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s) {
		StringBuilder sb = new StringBuilder();
		
		char before = '0';
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				sb.append(0);
			}
			else if(c <= 'c') {
				if(before == '2') {
					sb.append(" ");
				}
				before = '2';
				sb.append("2".repeat(c - 'a' + 1));
			}
			else if(c <= 'f') {
				if(before == '3') {
					sb.append(" ");
				}
				before = '3';
				sb.append("3".repeat(c - 'd' + 1));
			}
			else if(c <= 'i') {
				if(before == '4') {
					sb.append(" ");
				}
				before = '4';
				sb.append("4".repeat(c - 'g' + 1));
			}
			else if(c <= 'l') {
				if(before == '5') {
					sb.append(" ");
				}
				before = '5';
				sb.append("5".repeat(c - 'j' + 1));
			}
			else if(c <= 'o') {
				if(before == '6') {
					sb.append(" ");
				}
				before = '6';
				sb.append("6".repeat(c - 'm' + 1));
			}
			else if(c <= 's') {
				if(before == '7') {
					sb.append(" ");
				}
				before = '7';
				sb.append("7".repeat(c - 'p' + 1));
			}
			else if(c <= 'v') {
				if(before == '8') {
					sb.append(" ");
				}
				before = '8';
				sb.append("8".repeat(c - 't' + 1));
			}
			else {
				if(before == '9') {
					sb.append(" ");
				}
				before = '9';
				sb.append("9".repeat(c - 'w' + 1));
			}
		}
		return sb.toString();
	}
}
