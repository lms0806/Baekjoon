import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		String a = br.readLine(), b = br.readLine();
		
		int idx = 0;
		int[] arr = new int[a.length() * 2];
		for(int i = 0; i < a.length(); i++) {
			arr[idx++] = num[a.charAt(i) - 'A'];
			arr[idx++] = num[b.charAt(i) - 'A'];
		}
		
		for(int i = 1; i <= arr.length - 2; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				arr[j] = (arr[j] + arr[j + 1]) % 10;
			}
		}

		System.out.print(arr[0] + "" + arr[1]);
	}
}
