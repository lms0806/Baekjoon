import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 0, y = 0, num = 1;
		boolean a = false, b = false;
		int counta = 0, countb = 0;
		while(n --> 0) {
			if(!b) {
				y += num < 0 ? -1 : 1;
				countb++;

				if(countb == Math.abs(num)) {
					b = true;
				}
				continue;
			}
			
			if(b && !a) {
				x += num < 0 ? -1 : 1;
				counta++;

				if(counta == Math.abs(num)) {
					a = true;
				}
			}
			
			if(a && b) {
				a = false;
				b = false;
				num = num < 0 ? -(num - 1) : -(num + 1);
				counta = 0;
				countb = 0;
			}
		}
		System.out.print(x + " " + y);
	}
}
