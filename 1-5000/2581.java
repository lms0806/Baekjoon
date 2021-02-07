import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int answer = 0, min = 10000, count = 0;
		for(int i = a; i <= b; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && i != 1) {
				answer += i;
				if(min > i) {
					min = i;
				}
			}
			count = 0;
		}
		
		StringBuilder sb = new StringBuilder();
		if(answer == 0) {
			sb.append(-1).append("\n");
		}
		else {
			sb.append(answer).append("\n").append(min).append("\n");
		}
		System.out.print(sb);
	}
}
