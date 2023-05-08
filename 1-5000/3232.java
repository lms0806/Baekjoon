import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int answer = 0;
			int start = Math.max(max(a), Math.max(max(b), max(c)));
			for(int i = start + 1; i <= 16; i++){
				if(change(a, i) * change(b, i) == change(c, i)){
					answer = i;
					break;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}

	public static int max(int num){
		int max = 0;
		while(num > 0){
			max = Math.max(max, num % 10);
			num /= 10;
		}
		return max;
	}

	public static int change(int num, int n){
		int idx = 0, answer = 0;
		while(num > 0){
			answer += (num % 10) * (int)(Math.pow(n, idx));
			num /= 10;
			idx++;
		}
		return answer;
	}
}
