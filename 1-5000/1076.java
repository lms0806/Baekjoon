import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i++) {
			String str = br.readLine();
			for(int j = 0; j < color.length; j++) {
				if(color[j].equals(str)) {
					num[i] = j;
					break;
				}
			}
		}
		long answer = num[0] * 10 + num[1];
		
		for(int i = 0; i < num[2]; i++) {
			answer *= 10;
		}
		System.out.print(answer);
	}
}
