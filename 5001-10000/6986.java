import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(arr);
		
		double a = 0.0, b = 0.0;
		for(int i = k; i < n - k; i++) {
			a += arr[i];
		}
		b = a + arr[k] * k + arr[n - k - 1] * k;
		
		System.out.print(String.format("%.2f", a / (n - k - k)) + "\n" + String.format("%.2f", b / n));
	}
}
