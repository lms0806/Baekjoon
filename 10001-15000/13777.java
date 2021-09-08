import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int size = Integer.parseInt(br.readLine());
			
			if(size == 0) {
				break;
			}
			
			int start = 1, end = 50;
			while(start <= end) {
				int mid = (start + end) / 2;
				
				sb.append(mid);
				if(mid == size) {
					break;
				}
				else {
					if(mid < size) {
						start = mid + 1;
					}
					else {
						end = mid - 1;
					}
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
