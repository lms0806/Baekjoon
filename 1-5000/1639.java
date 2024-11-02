import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 2; j < arr.length + 1; j += 2) {
				int a = 0, b = 0;
				for(int k = i; k < (i + j) / 2; k++) {
					a += arr[k];
				}
				for(int k = (i + j) / 2; k < j; k++) {
					b += arr[k];
				}
				
				if(a == b) {
					answer = Math.max(answer, j - i);
				}
			}
		}
		System.out.print(answer);
	}
}
