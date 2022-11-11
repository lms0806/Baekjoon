import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 100, b = 100;
		for(int i = 0; i < n / 3 + 1; i++) {
			for(int j = 0; j < n / 2 + 1; j++) {
				if(i * 3 + j * 2 == n) {
					if(a + b > i + j) {
						b = i;
						a = j;
					}
				}
			}
		}
		
		System.out.print(a + " " + b);
	}
}
