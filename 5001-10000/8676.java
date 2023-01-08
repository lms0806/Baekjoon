import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[1000001];
		
		String answer = "NIE";
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 1) {
				if(arr[i] != arr[i - 1] && arr[i - 1] != arr[i - 2] && arr[i] != arr[i - 2]) {
					answer = "TAK";
					break;
				}
			}
		}
		
		System.out.print(answer);
	}
}
