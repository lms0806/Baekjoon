import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] str17 = {{5000000,1},{3000000,2},{2000000,3},{500000,4},{300000,5},{100000,6}};
		int[][] str18 = {{5120000,1},{2560000,2},{1280000,4},{640000,8},{320000,16}};
		
		int num = Integer.parseInt(br.readLine());
		
		int a, b;
		StringBuilder sb = new StringBuilder();
		while(num-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = 0, sum = 0;
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			while(a != 0) {
				if(count == str17.length) {
					break;
				}
				a -= str17[count][1];
				if(a <= 0) {
					sum+=str17[count][0];
					break;
				}
				count++;
			}
			
			count = 0;
			
			while(b != 0) {
				if(count == str18.length) {
					break;
				}
				b -= str18[count][1];
				if(b <= 0) {
					sum += str18[count][0];
					break;
				}
				count++;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
