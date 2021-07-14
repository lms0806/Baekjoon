import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		int[] num = new int[101];
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			for(int j = start; j < end; j++) {
				num[j]++;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				answer += num[i] == 3 ? c * 3 : num[i] == 2 ? b * 2 : a;
			}
		}
		System.out.print(answer);
	}
}
