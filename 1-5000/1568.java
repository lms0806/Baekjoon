import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0, count = 1;
		while(size > 0) {
			size -= count;
			count++;
			if(count > size) {
				count = 1;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
