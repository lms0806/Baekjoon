import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		while(t --> 0) {
			if(br.readLine().equals("LIE")) {
				flag = !flag;
			}
		}
		System.out.print(flag ? "TRUTH" : "LIE");
	}
}
