import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	
    	int answer = 0;
    	int s = 1, e = Integer.MAX_VALUE - 1;
    	while(s <= e) {
    		int mid = (s + e) >> 1;
    		
    		if(check(m, mid, arr)) {
    			answer = mid;
    			e = mid - 1;
    		}
    		else {
    			s = mid + 1;
    		}
    	}
    	System.out.print(answer);
    }
    
    public static boolean check(int m, int mid, int[] arr) {
    	int count = 1, temp = mid;
    	for(int a : arr) {
    		if(temp >= a) {
    			temp -= a;
    		}
    		else {
    			temp = mid;
    			count++;
    			
    			if(a > temp) {
    				return false;
    			}
    			else {
    				temp -= a;
    			}
    		}
    	}
    	return count <= m;
    }
}
