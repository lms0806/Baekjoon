import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[2][10];
		for(int i = 0 ; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 10; j++) {
				arr[i][j] += Integer.parseInt(st.nextToken());
			}
		}
		
		int suma = 0, sumb = 0;
		String win = "D";
		for(int i = 0; i < 10; i++) {
			if(arr[0][i] > arr[1][i]) {
				suma+=3;
				win = "A";
			}
			else if(arr[0][i] == arr[1][i]) {
				suma++;
				sumb++;
			}
			else {
				sumb+=3;
				win = "B";
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(suma + " " + sumb).append("\n");
		sb.append(suma > sumb ? "A" : suma == sumb ? win : "B");
		System.out.print(sb);
	}
}
