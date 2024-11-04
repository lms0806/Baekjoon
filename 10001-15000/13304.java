import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int oneTwo = 0;
		int[] boy = new int[2], girl = new int[2];
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			if(y < 3) {
				oneTwo++;
			}
			else if(y < 5){
				if(s == 0) {
					boy[0]++;
				}
				else {
					girl[0]++;
				}
			}
			else {
				if(s == 0) {
					boy[1]++;
				}
				else {
					girl[1]++;
				}
			}
		}
		
		int answer = oneTwo / k;
		if(oneTwo % k != 0) {
			answer++;
		}
		
		for(int i = 0; i < 2; i++) {
			if(boy[i] != 0) {
				answer += boy[i] / k;
				if(boy[i] % k != 0) {
					answer++;
				}
			}
		}
		for(int i = 0; i < 2; i++) {
			if(girl[i] != 0) {
				answer += girl[i] / k;
				if(girl[i] % k != 0) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
