import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[10];
		int temp = n;
		
		while(temp != 0) {
			int a = temp % 10;
			num[a == 6 ? 9 : a]++;
			temp /= 10;
		}
		
		int nummax = 0;
		
		for(int i = 0; i < num.length - 1; i++) {
			if(nummax <= num[i]) {
				nummax = num[i];
			}
		}
		
		int sixnine = num[9] / 2;
		
		sixnine += num[9] % 2 == 0 ? 0 : 1;
		
		int max = (int) Math.max(nummax, sixnine);
		if(n == 0) {
			max = 1;
		}
		
		System.out.print(max);
	}
}
