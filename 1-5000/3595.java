import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int min = 999999999;
		int a = 0, b = 0, c = 0;
		for(int i = 1; i <= size; i++) {
			if(size % i == 0) {
				for(int j = 1; j <= size/i; j++) {
					if((size / i) % j == 0) {
						int k = size / i / j;
						
						int n = (i * j + i * k + j * k) * 2;
						if(n < min) {
							min = n;
							a = i;
							b = j;
							c = k;
						}
					}
				}
			}
		}
		System.out.print(a + " " + b + " " + c);
	}
}
