import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < size - 1; i++) {
			int count = 0;
			for(int j = i + 1; j < size; j++) {
				if(num[i] > num[j]) {
					count++;
				}
				else {
					break;
				}
			}
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
