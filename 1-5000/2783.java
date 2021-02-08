import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		double x1,y1,sum1 = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		
		double sum = 1000/y*x;
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			sum1 = 1000/y1*x1;
			if(sum > sum1) {
				sum = sum1;
			}
		}

		System.out.print(sum);
	}
}
