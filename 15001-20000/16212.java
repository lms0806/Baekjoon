import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
        	ArrayList<Integer> arr = new ArrayList<>();

        	int num = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	while(num-->0){
            		arr.add(Integer.parseInt(st.nextToken()));
        	}
        	Collections.sort(arr);

        	StringBuilder sb = new StringBuilder();
        	for(Integer i : arr){
            		sb.append(i).append(" ");
        	}
        	System.out.print(sb);
	}
}
