import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {" @@@   @@@  ", "@   @ @   @ ", "@    @    @ ", "@         @ ", " @       @  ", "  @     @   ", "   @   @    ", "    @ @     ", "     @      "};
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s.repeat(n)).append("\n");
		}
		System.out.print(sb);
	}
}
