import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int hp = Integer.parseInt(br.readLine());
		
		hp = hp - arr[0][1] - arr[1][1] - arr[2][1];
		
		int answer = 0;
		while(true) {
			if(hp <= 0) {
				break;
			}
			
			answer++;
			
			for(int i = 0; i < 3; i++) {
				if(answer % arr[i][0] == 0) {
					hp -= arr[i][1];
				}
			}
		}
		System.out.print(answer);
	}
}
