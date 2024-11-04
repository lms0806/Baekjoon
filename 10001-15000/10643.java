import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[12];
		for(int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 8; i < 12; i++) {
			arr[i] = arr[i - 8];
		}
		
		int answer = 0;
		for(int i = 0; i < 8; i++) {
			answer = Math.max(answer, arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3]);
		}
		System.out.print(answer);
	}
}
