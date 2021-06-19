import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 1; i < 500; i++) {
			int a = i * i;
			for(int j = i + 1; j <= 500; j++) {
				int b = j * j;
				
				if(b - a == min) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
