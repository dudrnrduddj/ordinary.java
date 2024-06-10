package org.ordinary.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ByteOff {

	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = new FileInputStream("src/org/ordinary/day15/stream/inputstream/reading.txt");
			int readCount;
			byte[] readBytes = new byte[3];
			String result = "";
			while (true) {
				readCount = is.read(readBytes, 1, 2);	// read(byte[] b, int off, int len)
				if (readCount == -1)
					break;
				result += new String(readBytes, 0, readCount);
			}

			System.out.println(result);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
