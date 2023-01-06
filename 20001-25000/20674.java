import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine()) - 1;
        
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        while(t --> 0) {
        	int num = Integer.parseInt(br.readLine());
        	
        	if(n < num) {
        		answer += num - n;
        	}
        	else {
        		n = num;
        	}
        }
        System.out.print(answer);
    }
}
