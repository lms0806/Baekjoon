import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        if(t == 1) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long num = Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());
        	
        	char[] answer = new char[13];
        	
        	Arrays.fill(answer, 'a');
        	
        	for(int i = 0; i < answer.length; i++) {
        		if(num > 0) {
        			answer[i] = (char) ((num % 26) + 'a');
        			num /= 26;
        		}
        		else {
        			
        		}
        	}
        	System.out.print(new String(answer));
        }
        else {
        	long answer = 0, num = 1;
        	for(char c : br.readLine().toCharArray()) {
        		answer += (c - 'a') * num;
        		num *= 26;
        	}
        	System.out.print(answer);
        }
    }
}
