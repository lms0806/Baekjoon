import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine().trim();
			
			if(s.equals("0 0 0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			double[] arr = new double[3];
			
			for(int i = 0; i < 3; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			sb.append(solve(arr)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(double[] arr) {
		if(arr[0] >= 0.25 && arr[1] >= 90 && arr[2] >= 125) {
			if(arr[0] <= 7 && arr[1] <= 155 && arr[2] <= 290) {
				return "letter";
			}
			else if(arr[0] <= 50 && arr[1] <= 300 && arr[2] <= 380) {
				return "packet";
			}
			else if((arr[0] > 50 || arr[1] > 300 || arr[2] > 380) && (arr[0] + arr[1]) * 2 + arr[2] <= 2100) {
				return "parcel";
			}
		}
		return "not mailable";
	}
}
