import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		double[] n = new double[8];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 8; i++) {
			n[i] = Double.parseDouble(st.nextToken());
		}

		double a = Math.sqrt((n[0] - n[2]) * (n[0] - n[2]) + (n[1] - n[3]) * (n[1] - n[3]));
		double b = Math.sqrt((n[4] - n[6]) * (n[4] - n[6]) + (n[5] - n[7]) * (n[5] - n[7]));

		System.out.print(Math.max(a, b));
	}
}
