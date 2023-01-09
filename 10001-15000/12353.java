import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char male = st.nextToken().charAt(0);
			
			double sum = (height(st.nextToken()) + height(st.nextToken()) + (male == 'B' ? 5.0 : -5.0)) / 2.0;
			
			double inches = 4.0;
			if(sum != (int)sum) {
				inches = 3.5;
			}
			
			sb.append("Case #").append(t).append(": ").append(output(sum - inches)).append(" to ").append(output(sum + inches)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static double height(String str) {
		String[] s = str.split("'");
		
		double feet = Double.parseDouble(s[0]);
		double inch = Double.parseDouble(s[1].substring(0, s[1].length() - 1));
		
		return feet * 12.0 + inch;
	}
	
	public static String output(double n) {
		int feet = (int) (n / 12.0);
		int inch = (int) (n % 12.0);
		
		return feet + "'" + inch + '"';
	}
}
