import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			answer = 0;
			int result = isPalindrome(br.readLine());
			
			sb.append(result).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
	public static int recursion(String s, int l, int r){
		answer++;
        if(l >= r) {
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	return 0;
        }
        return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length() - 1);
    }
}
