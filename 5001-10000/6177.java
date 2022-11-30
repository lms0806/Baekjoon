import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double[] arr = new double[n];
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.print(sum / n + "\n" + (n % 2 == 1 ? arr[n / 2] : (arr[n / 2] + arr[n / 2 - 1]) / 2));
	}
}
