import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] n = new int[size];
		
		int avg = 0;
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(br.readLine());
			avg += n[i];
		}
		avg /= size;
		
		int answer = 0;
		for(int num : n) {
			if(num > avg) {
				answer += num - avg;
			}
		}
		System.out.print(answer);
	}
}
