import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		double[] num = {350.34, 230.90, 190.55, 125.30, 180.90};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			double sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < 5; j++) {
				int a = Integer.parseInt(st.nextToken());
				sum += a * num[j];
			}
			sb.append("$").append(String.format("%.2f", sum)).append("\n");
		}
		System.out.print(sb);
	}
}
