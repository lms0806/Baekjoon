import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double red = Double.parseDouble(st.nextToken());
		double yellow = Double.parseDouble(st.nextToken());
		double blue = Double.parseDouble(st.nextToken());
		
		double[] arr = new double[6];
		
		for(int i = 0; i < 6; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		double needred = arr[4] + (arr[3] + arr[5]) / 2;
		double needyellow = arr[0] + (arr[1] + arr[5]) / 2;
		double needblue = arr[2] + (arr[1] + arr[3]) / 2;
		
		System.out.print(print(red, needred) + " " + print(yellow, needyellow) + " " + print(blue, needblue));
	}
	
	public static String print(double n, double needn) {
		double max = Math.max(needn - n, 0.0);
		
		return max == (int)max ? (int)max + "" : String.format("%.1f", max);
	}
}
