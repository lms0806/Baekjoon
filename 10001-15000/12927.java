import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int answer = 0;
		char[] c = (" " + br.readLine()).toCharArray();
		for(int i = 1; i < c.length; i++) {
			if(c[i] == 'Y') {
				answer++;
				for(int j = i; j < c.length; j += i) {
					c[j] = c[j] == 'Y' ? 'N' : 'Y';
				}
			}
		}
		System.out.print(answer);
	}
}
