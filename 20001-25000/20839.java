import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		System.out.print(solve(a, b, c, Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken())));
	}
	
	public static char solve(double a, double b, double c, double studenta, double studentb, double studentc) {
		if(studentb >= b && studentc >= c) {
			return studenta >= a ? 'A' : studenta >= a / 2 ? 'B' : 'C';
		}
		return studentb >= b / 2 && studentc >= c / 2 ? 'D' : 'E';
	}
}
