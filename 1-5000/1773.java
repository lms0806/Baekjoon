import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int num = 0;
		int[] number = new int[c];
		int answer = 0;
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			for(int j = num; j <= c; j+=num) {
				if(number[j-1] == 0) {
					number[j-1] = 1;
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
