import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] a = input(br.readLine()), b = input(br.readLine());
		
		double[] answer = {a[0] / b[0], a[1] / b[1], a[2] / b[2]};
		
		double min = Math.min(answer[0], Math.min(answer[1], answer[2]));
		
		System.out.print((a[0] - min * b[0]) + " " + (a[1] - min * b[1]) + " " + (a[2] - min * b[2]));
	}
	
	public static double[] input(String s) {
		StringTokenizer st = new StringTokenizer(s);
		
		double[] arr = new double[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		return arr;
	}
}
