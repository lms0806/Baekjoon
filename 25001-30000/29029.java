import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		int[] arr = new int[4];
		
		int max = 0;
		for(char c : br.readLine().toCharArray()) {
			int idx = 3;
			if(c == 'N') {
				idx = 0;
			}
			else if(c == 'S') {
				idx = 1;
			}
			else if(c == 'E') {
				idx = 2;
			}
			
			arr[idx]++;
			max = Math.max(arr[idx], max);
		}
		
		int answer = 0;
		for(int a : arr) {
			answer += a;
		}
		
		System.out.print(answer - max);
	}
}
