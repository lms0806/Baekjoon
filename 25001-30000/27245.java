import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int w = Integer.parseInt(br.readLine()), l = Integer.parseInt(br.readLine()), h = Integer.parseInt(br.readLine());
		
		System.out.print(Math.min(w,  l) >= h * 2 && Math.max(w, l) / 2 <= Math.min(w, l) ? "good" : "bad");
	}
}
