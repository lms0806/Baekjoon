import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			int[] num = new int[20];
			for(int j = 0; j < 20; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			boolean check = true;
			while(check) {
				check = false;
				for(int j = 0; j < 19; j++) {
					if(num[j] > num[j + 1]) {
						check = true;
						int temp = num[j];
						num[j] = num[j + 1];
						num[j + 1] = temp;
						answer++;
						break;
					}
				}
			}
			sb.append(i).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
