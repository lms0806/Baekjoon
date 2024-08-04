import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[3];
		String[] name = {"Joffrey", "Robb", "Stannis"};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 0) {
					arr[j] = 1;
				}
				
				arr[j] *= Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			if(arr[i] == Math.max(arr[0], Math.max(arr[1], arr[2]))) {
				sb.append(name[i]).append(" ");
			}
		}
		System.out.print(sb);
	}
}
