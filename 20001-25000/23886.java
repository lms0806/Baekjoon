import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int[] arr = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		System.out.print(solve(arr) ? "ALPSOO" : "NON ALPSOO");
	}
	
	public static boolean solve(int[] arr) {
		if(arr[1] - arr[0] < 0 || arr[arr.length - 1] - arr[arr.length - 2] > 0) {
			return false;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				return false;
			}
		}
		
		for(int i = 2; i < arr.length; i++) {
			int a = arr[i] - arr[i - 1], b = arr[i - 1] - arr[i - 2];
			
			if(a != b && a * b > 0) {
				return false;
			}
		}
		
		return true;
	}
}
