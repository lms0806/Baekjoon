import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        HashSet<String> set = new HashSet<>();
        while(n --> 0) {
        	set.add(br.readLine());
        }
        
        int m = Integer.parseInt(br.readLine());
        
        int answer = 0;
        while(m --> 0) {
        	String s = br.readLine();
        	
        	if(set.contains(s)) {
        		answer++;
        	}
        }
        
        System.out.print(answer);
    }
}
