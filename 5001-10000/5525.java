import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		br.readLine();
		char[] ch = br.readLine().toCharArray();
		
		int answer = 0, count = 0;
		for(int i = 1; i < ch.length - 1; i++) {
			if(ch[i - 1] == 'I' && ch[i] == 'O' && ch[i + 1] == 'I') {
				count++;
				if(count == size) {
					count--;
					answer++;
				}
				i++;
			}
			else {
				count = 0;
			}
		}
		System.out.print(answer);
	}
}
