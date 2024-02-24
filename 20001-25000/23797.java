import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[2];
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'K') {
				if(arr[1] != 0) {
					arr[1]--;
				}
				arr[0]++;
			}
			else {
				if(arr[0] != 0) {
					arr[0]--;
				}
				arr[1]++;
			}
		}
		
		System.out.print(arr[0] + arr[1]);
	}
}
