import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int bestCal = c / a;
		
		int totalPrice = a, totalCal = c;
		for(int i = n - 1; i >= 0; i--) {
			totalPrice += b;
			totalCal += arr[i];
			
			if(bestCal < totalCal / totalPrice) {
				bestCal = totalCal / totalPrice;
			}
		}
		System.out.print(bestCal);
	}
}
