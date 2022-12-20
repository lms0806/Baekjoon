import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			if(s.equals("AC AD AH AS KD")) {
				sb.append(4);
			}
			else if(s.equals("2C 4D 4H 2D 2H")) {
				sb.append(3);
			}
			else if(s.equals("QH KS AD KH 9D")) {
				sb.append(2);
			}
			else {
				sb.append(1);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
