import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int[] start = new int[26], end = new int[26];
		
		String s = br.readLine();
		for(int i = 0; i < 52; i++) {
			int idx = s.charAt(i) - 'A';
			
			if(start[idx] == 0) {
				start[idx] = i + 1;//처음 시작
			}
			else {
				end[idx] = i + 1;//끝
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				if(start[i] < start[j] && start[j] < end[i] && end[i] < end[j]) {
					answer++;
				}//처음, 처음과 끝, 끝과끝 비교
			}
		}
		System.out.print(answer);
	}
}
