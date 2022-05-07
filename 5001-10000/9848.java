import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()) - 1, number = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		int check = Integer.parseInt(br.readLine());
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(check - num >= number) {
				answer++;
			}
			check = num;
		}
		System.out.print(answer);
	}
}
