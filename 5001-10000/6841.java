import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] shortform = {"CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL"};
		String[] Translation = {"see you", "I’m happy", "I’m unhappy", "wink", "stick out my tongue", "sleepy", "totally awesome", "Canadian Computing Competition", "because", "thank-you", "you’re welcome", "talk to you later"};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			boolean flag = false;
			for(int i = 0; i < shortform.length; i++) {
				if(shortform[i].equals(s)) {
					sb.append(Translation[i]);
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				sb.append(s);
			}
			
			sb.append("\n");
			
			if(s.equals("TTYL")){
				break;
			}
		}
		System.out.print(sb);
	}
}
