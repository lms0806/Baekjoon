import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		double[] arr = new double[4];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double h = 0, s = 0;
		if(m == 1) {
			h = arr[2];
			s = arr[3];
		}
		else if(m == 0) {
			h = arr[0];
			s = arr[1];
		}
		
		for(int i = 0; i < n - 1; i++) {
			double temp1 = h * arr[0] + s * arr[2];
			double temp2 = h * arr[1] + s * arr[3];
			
			h = temp1;
			s = temp2;
		}
		
		System.out.print((int)(h * 1000) + "\n" + (int)(s * 1000));
	}
}
