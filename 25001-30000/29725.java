import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = 0;
		
		int[] score = {0, 1, 3, 3, 5, 9, 0, -1, -3, -3, -5, -9};
		char[] chess = {'K','P','N','B','R','Q','k','p','n','b','r','q'};
		for(int i = 0; i < 8; i++) {
			for(char c : br.readLine().toCharArray()) {
				for(int j = 0; j < chess.length; j++) {
					if(c == chess[j]) {
						answer += score[j];
						break;
					}
				}
			}
		}
		System.out.print(answer);
	}
} 
