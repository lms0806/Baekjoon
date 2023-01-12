import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[4];
		
		int zero = 0, zeroidx = 0;
		boolean[] num = new boolean[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			num[arr[i]] = true;
			
			if(arr[i] == 0) {
				zero++;
				zeroidx = i + 1;
			}
		}
		
		if(zero == 0) {
			System.out.print(arr[0] + " " + arr[1]);
		}
		else if(zero == 1) {
			System.out.print(zeroidx + " ");
			for(int i = 1; i < 5; i++) {
				if(!num[i]) {
					System.out.print(i);
					break;
				}
			}
		}
		else {
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i < 5; i++) {
				if(!num[i]) {
					sb.append(i).append(" ");
				}
			}
			System.out.print(sb);
		}
	}
}
