import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 2 + Integer.parseInt(st.nextToken()) * 3;
		}
		
		System.out.print(arr[0] == arr[1] ? 0 : arr[0] > arr[1] ? 1 : 2);
	}
}
