import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int count = 0;
		for(String s : str) {
			if(s.contains("ae")) {
				count++;
			}
		}
		
		System.out.print(count * 5 >= str.length * 2 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska");
	}
}
