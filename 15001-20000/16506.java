import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] bit3 = {"000", "001", "010", "011", "100", "101", "110", "111"};
    	String[] bit4 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    	
    	HashMap<String, String> map = new HashMap<>() {{
    		put("ADD", "0000");
			put("SUB", "0001");
			put("MOV", "0010");
			put("AND", "0011");
			put("OR", "0100");
			put("NOT", "0101");
			put("MULT", "0110");
			put("LSFTL", "0111");
			put("LSFTR", "1000");
			put("ASFTR", "1001");
			put("RL", "1010");
			put("RR", "1011");
    	}};
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	int isc = 0;
    	StringBuilder sb = new StringBuilder();
    	while(t --> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		String opcode = st.nextToken();
    		int rD = Integer.parseInt(st.nextToken()), rA = Integer.parseInt(st.nextToken()), rB = Integer.parseInt(st.nextToken());
    		
    		if(opcode.endsWith("C")) {
    			isc = 1;
    			opcode = opcode.substring(0, opcode.length() - 1);
    		}
    		else {
    			isc = 0;
    		}
    		
    		sb.append(map.get(opcode)).append(isc).append("0").append(bit3[rD]).append(bit3[rA]).append(isc != 0 ? bit4[rB] : bit3[rB] + "0").append("\n");
    	}
    	System.out.print(sb);
    }
}
