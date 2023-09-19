import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;
        
        int idx = 0;
        char[] ch = {'H', 'O', 'N', 'I'};
        for(char c : br.readLine().toCharArray()) {
        	if(c == ch[idx]) {
        		idx++;
        	}
        	
        	if(idx == ch.length) {
        		answer++;
        		idx = 0;
        	}
        }
        System.out.print(answer);
    }
}
