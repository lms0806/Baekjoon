import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0, max = 0;
		for(int i = 0; i < size; i++) {
			int[] num = new int[5];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < 3; j++) {
				for(int k = j + 1; k < 4; k++) {
					for(int l = k + 1; l < 5; l++) {
						int n = (num[j] + num[k] + num[l]) % 10;
						if(max < n) {
							max = n;
							answer = i + 1;
						}
						else if(max == n && answer < i + 1) {
							answer = i + 1;
						}
					}
				}
			}
		}
		System.out.print(answer);
	}
}
