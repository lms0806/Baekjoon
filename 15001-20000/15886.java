import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		char[] ch = br.readLine().toCharArray();
		
		int index = 0, answer = 0;
		while(index < ch.length) {
			while(index < ch.length && ch[index] != 'W') {
				index++;
			}
			while(index < ch.length && ch[index] != 'E') {
				index++;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
