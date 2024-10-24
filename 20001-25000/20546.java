import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int jun = Integer.parseInt(br.readLine());
    	int song = jun;
    	
    	int[] arr = new int[14];
    	
    	int junju = 0, songju = 0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    		
    		if(jun >= arr[i]) {
    			junju += jun / arr[i];
    			jun = jun % arr[i];
    		}
    	}
    	
    	for(int i = 3; i < arr.length; i++) {
    		if(arr[i - 3] < arr[i - 2] && arr[i - 2] < arr[i - 1]) {
    			if(songju != 0) {
    				song += songju * arr[i];
    				songju = 0;
    			}
    		}
    		else if(arr[i - 3] > arr[i - 2] && arr[i - 2] > arr[i - 1]) {
    			if(song >= arr[i]) {
    				songju += song / arr[i];
    				song %= arr[i];
    			}
    		}
    	}
    	
    	jun += junju * arr[13];
    	song += songju * arr[13];
    	
    	System.out.print(jun > song ? "BNP" : jun == song ? "SAMESAME" : "TIMING");
    }
}
