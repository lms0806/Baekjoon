import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		double target = Double.parseDouble(st.nextToken());
		
		double sum = 0;
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Double.parseDouble(st.nextToken());
			
			if(i == n - 1) {
				break;
			}
			
			String s = st.nextToken();
			for(int j = 0; j < grade.length; j++) {
				if(grade[j].equals(s)) {
					sum += arr[i] * score[j];
					break;
				}
			}
		}
		
		System.out.print(solve(score, grade, arr, sum, target));
	}
	
	public static String solve(double[] score, String[] grade, double[] arr, double sum, double target) {
		double divide = 0;
		for(double a : arr) {
			divide += a;
		}
		
		for(int i = grade.length - 1; i >= 0; i--) {
			double num = sum + arr[arr.length - 1] * score[i];

			if(String.valueOf(num / divide).split("\\.")[1].length() == 2 && num / divide > target) {
				return grade[i];
			}
			else if(Math.floor(num / divide * 100.0) / 100.0 > target) {
				return grade[i];
			}
		}
		return "impossible";
	}
}
