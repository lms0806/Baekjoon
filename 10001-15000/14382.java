import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append("Case #").append(i).append(": ");
			if(n == 0) {
				sb.append("INSOMNIA");
			}
			else {
				int[] num = new int[10];
				int count = 1;
				while(true) {
					int number = n * count;
					
					while(number != 0) {
						num[number % 10]++;
						number /= 10;
					}
					
					int cnt = 0;
					for(int j = 0; j < num.length; j++) {
						if(num[j] >= 1) {
							cnt++;
						}
						else {
							break;
						}
					}
					if(cnt == 10) {
						sb.append(n * count);
						break;
					}
					count++;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
