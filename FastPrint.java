import java.io.*;

class FastPrint {
	static void prints() {
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				System.out.print(randomChar);
			}
			System.out.print(" ");
		}
	}

	static void printff() throws Exception {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				output.write(randomChar);
			}
			output.write(" ");
		}
	}

	static void printo() throws Exception {
		OutputStream output = new BufferedOutputStream ( System.out );
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				output.write(randomChar);
			}
			output.write(' ');
		}
	}

	static void printSOPsb() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				sb.append(randomChar);
			}
			sb.append(" ");
		}

		System.out.print(sb.toString());
	}

	static void printBWsb() throws Exception {
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				sb.append(randomChar);
			}
			sb.append(" ");
		}

		output.write(sb.toString());
	}

	static void printOSsb() throws Exception {
		OutputStream output = new BufferedOutputStream ( System.out );
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<100000; i++) {
			int randomCountOfSymbols = (int) (Math.random() * 50);
			for (int j=0; j<randomCountOfSymbols; j++) {
				char randomChar = (char) ((int) (Math.random()*27) + 65);
				sb.append(randomChar);
			}
			sb.append(" ");
		}

		output.write(sb.toString().getBytes());
	}

	public static void main(String[] args) throws Exception{
		long sopStart = System.currentTimeMillis();
		prints();
		long sopStop = System.currentTimeMillis();
		

		long bwStart = System.currentTimeMillis();
		printff();
		long bwStop = System.currentTimeMillis();

		long osStart = System.currentTimeMillis();
		printo();
		long osStop = System.currentTimeMillis();

		long sOPsbStart = System.currentTimeMillis();
		printSOPsb();
		long sOPsbStop = System.currentTimeMillis();

		long bWsbStart = System.currentTimeMillis();
		printBWsb();
		long bWsbStop = System.currentTimeMillis();

		long oSsbStart = System.currentTimeMillis();
		printOSsb();
		long oSsbStop = System.currentTimeMillis();

		System.out.println( "\n\nSystem.out.println: " + (sopStop - sopStart) );
		System.out.println( "BufferedWriter: " + (bwStop - bwStart) );
        System.out.println( "BufferedOutputStream: " + (osStop - osStart) );

        System.out.println( "String Builder with System.out.println: " + (sOPsbStop - sOPsbStart) );
        System.out.println( "BufferedWriter with System.out.println: " + (bWsbStop - bWsbStart) );
        System.out.println( "BufferedOutputStream with System.out.println: " + (oSsbStop - oSsbStart) );
	}
}