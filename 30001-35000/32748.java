import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[10];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 10; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int num = findN(st.nextToken(), arr) + findN(st.nextToken(), arr);
        
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
        	sb.append(arr[num % 10]);
        	num /= 10;
        }
        System.out.print(sb.reverse());
    }
    
    public static int findN(String s, int[] arr) {
    	int[] num = new int[s.length()];
    	for(int i = 0; i < s.length(); i++) {
    		for(int j = 0; j < arr.length; j++) {
    			if(arr[j] == s.charAt(i) - '0') {
    				num[i] = j;
    			}
    		}
    	}
    	
    	int answer = 0;
    	for(int a : num) {
    		answer += a;
    		answer *= 10;
    	}
    	return answer / 10;
    }
}
