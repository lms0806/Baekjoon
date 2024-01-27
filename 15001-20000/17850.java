import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[4];
		for(int i = 0; i < 4; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int t = Integer.parseInt(st.nextToken());
		
		double[][] arr = new double[4][2];
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String type = st.nextToken();
			st.nextToken();
			
			int idx = type.equals("Lab") ? 0 : type.equals("Hw") ? 1 : type.equals("Proj") ? 2 : 3;
			String[] s = st.nextToken().split("/");
			arr[idx][0] += Integer.parseInt(s[0]);
			arr[idx][1] += Integer.parseInt(s[1]);
		}
		
		double sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += num[i] * arr[i][0] / arr[i][1];
		}
		System.out.print((int)sum);
	}
}
