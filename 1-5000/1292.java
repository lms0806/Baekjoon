import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int num = 1,count = 0, sum = 0;
		while(true) {
			for(int i = 1; i <= num; i++) {
				count++;
				if(count >= a && count <= b) {
					sum += num;
				}
				if(count > b) {
					break;
				}
			}
			if(count > b) {
				break;
			}
			num++;
		}
		System.out.print(sum);
	}
}
