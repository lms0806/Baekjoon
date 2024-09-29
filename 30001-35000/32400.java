import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[20];
		
		double a = 0, b = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 20; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			b += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 20) {
				a += 20;
				if(i < arr.length - 1) {
					a += arr[i + 1];
				}
				else {
					a += arr[0];
				}
				
				if(i > 0) {
					a += arr[i - 1];
				}
				else {
					a += arr[arr.length - 1];
				}
				break;
			}
		}
		
		System.out.print(a / 3 > b / 20 ? "Alice" : a / 3 == b / 20 ? "Tie" : "Bob");
	}
}
