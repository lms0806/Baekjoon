import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[][] arr = new int[2][n];
    	
    	for(int i = 0; i < 2; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < n; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	int index = 0;
    	for(int i = 0; i < n; i++) {
    		if(arr[1][i] == arr[0][0]) {
    			index = i;
    			break;
    		}
    	}
    	
    	System.out.print(solveFront(arr, index) || solveBack(arr, index) ? "good puzzle" : "bad puzzle");
    }
    
    public static boolean solveFront(int[][] arr, int index) {
    	int idx = 0;
    	for(int i = index; i >= 0; i--) {
    		if(arr[0][idx++] != arr[1][i]) {
    			return false;
    		}
    	}
    	for(int i = arr[0].length - 1; i > index; i--) {
    		if(arr[0][idx++] != arr[1][i]) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static boolean solveBack(int[][] arr, int index) {
    	int idx = 0;
    	for(int i = index; i < arr[0].length; i++) {
    		if(arr[0][idx++] != arr[1][i]) {
    			return false;
    		}
    	}
    	for(int i = 0; i < index; i++) {
    		if(arr[0][idx++] != arr[1][i]) {
    			return false;
    		}
    	}
    	return true;
    }
}
