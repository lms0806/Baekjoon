import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int size = Math.min(str[i].length(), str[j].length());
				
				for(int k = 1; k <= size; k++) {
					if(str[j].endsWith(str[i].substring(0, k))) {
						answer++;
						break;
					}
					else if(str[i].endsWith(str[j].substring(0, k))) {
						answer++;
						break;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
