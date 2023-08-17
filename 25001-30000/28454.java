import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("-");
		int y = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]);
		
		int n = Integer.parseInt(br.readLine());
		
        int answer = 0;
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split("-");
            int gifty = Integer.parseInt(str[0]), giftm = Integer.parseInt(str[1]), giftd = Integer.parseInt(str[2]);
            
            if(gifty > y) {
				answer++;
			}
			else if(gifty == y) {
				if(giftm > m) {
					answer++;
				}	
				else if(giftm == m && giftd >= d) {
					answer++;
				}
			}
		}
		
		System.out.print(answer);
	}
}
