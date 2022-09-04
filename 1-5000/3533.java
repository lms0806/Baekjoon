import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[10];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = array[0] | array[1];
		for(int i = 0; i < 9; i++) {
			for(int j = i + 1; j < 10; j++) {
				if(i == 0 && j == 1) {
					continue;
				}
				answer ^= array[i] | array[j];
			}
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				for(int k = j + 1; k < 10; k++) {
					answer ^= array[i] | array[j] | array[k];
				}
			}
		}
		
		System.out.print(answer);
	}
}
