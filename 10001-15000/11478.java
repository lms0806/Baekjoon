import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] str = new String[s.length()];
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			str[i] = s.substring(i);//i번째 후로 자르기
		}
		
		Arrays.sort(str);

		answer += str[0].length();//0번째는 비교할게 없으므로 ++
		
		for(int i = 1; i < str.length; i++)  {
			answer += (str[i].length() - getCommon(str[i-1], str[i]));
		}
		
		System.out.print(answer);
	}
	public static int getCommon (String s1, String s2) {
		int result = 0; 
		
		for(int i=0; i<s1.length(); i++) {
			if(i >= s2.length()) {
				break;
			}
			if(s1.charAt(i) == s2.charAt(i)) {
				result++;
			}
			else {
				break;
			}
		}
		return result;
	}//중복되는 부분 count
}
