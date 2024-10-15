import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        boolean odd = false;
        if(n % 2 == 1) {
        	odd = true;
        	n--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(n --> 0) {
        	sb.append(n % 2 == 1 ? 1 : 2).append(" ");
        }
        System.out.print(sb + (odd ? "3" : ""));
    }
}
