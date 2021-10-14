import java.io.DataInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Reader s = new Reader();
		
		int n = s.nextInt();
		char c = (char) s.read();
		
		char qa = merge(c, 'A'), qb = merge(c, 'G'), qc = merge(c, 'C'), qd = merge(c, 'T');
		char pa, pb, pc, pd;
		
		for(int i = 1; i < n; i++) {
			pa = qa;
			pb = qb;
			pc = qc;
			pd = qd;
			
			c = (char) s.read();
			qa = merge(c, 'A');
			qb = merge(c, 'G');
			qc = merge(c, 'C');
			qd = merge(c, 'T');
			
			qa = qa == 'A' ? pa : qa == 'G' ? pb : qa == 'C' ? pc : pd;
			qb = qb == 'A' ? pa : qb == 'G' ? pb : qb == 'C' ? pc : pd;
			qc = qc == 'A' ? pa : qc == 'G' ? pb : qc == 'C' ? pc : pd;
			qd = qd == 'A' ? pa : qd == 'G' ? pb : qd == 'C' ? pc : pd;
		}
		
		System.out.print(c == 'A' ? qa : c == 'G' ? qb : c == 'C' ? qc : qd);
	}
	
	public static char merge(char c, char a) {
		if(c == a) {
			return c;
		}
		
		if(c == 'A') {
			return a == 'G' ? 'C' : a == 'C' ? 'A' : 'G';
		}
		if(c == 'G') {
			return a == 'A' ? 'C' : a == 'C' ? 'T' : 'A';
		}
		if(c == 'C') {
			return a == 'A' ? 'A' : a == 'G' ? 'T' : 'G';
		}
		if(c == 'T') {
			return a == 'A' ? 'G' : a == 'G' ? 'A' : 'G';
		}
		return c;
	}
	
	static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            return neg ? -ret : ret;
        }
 
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
            	buffer[0] = -1;
            }
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
    }
}
