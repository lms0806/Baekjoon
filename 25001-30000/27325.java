import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		br.readLine();
		
		int idx = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'L' && idx > 0) {
				idx--;
			}
			else if(c == 'R' && idx < 2) {
				idx++;
			}
			
			arr[idx]++;
		}
		
		System.out.print(arr[2]);
	}
}
