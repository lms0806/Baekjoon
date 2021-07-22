import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()) + 1;
		
		int num = n - 1;
		StringBuilder sb = new StringBuilder();
		while(n --> 1) {
			sb.append(n).append(n > 1 ? " bottles" : " bottle").append(" of beer on the wall, ").append(n).append(n > 1 ? " bottles" : " bottle").append(" of beer.").append("\n");
			sb.append("Take one down and pass it around, ").append(n - 1 == 0 ? "" : n - 1).append(n - 1 == 0 ? "no more bottles" : n - 1 > 1 ? " bottles" : " bottle").append(" of beer on the wall.").append("\n");
			sb.append("\n");
		}
		sb.append("No more bottles of beer on the wall, no more bottles of beer.\n").append("Go to the store and buy some more, ").append(num).append(num > 1 ? " bottles" : " bottle").append(" of beer on the wall.");
		System.out.print(sb);
	}
}
