package org.ordinary.day15;

public class MyNote {
	// --------- 바이트 기반 스트림 - 입력 -----------

	// 바이트 기반 스트림 - 입력
	// InputStream is = new FileInputStream("");

	// read(byte [] b) 입력스트림으로부터 읽은 바이트들을 매개값으로 주어진 바이트배열 b에 저장하고 실제로 읽은 바이트 수를 리턴
	// 데이터가 없으면 -1을 리턴
	// is.read(bytes) 는 is의 데이터를 bytes배열의 크기만큼 읽어서 배열에 저장한다 그리고 그 버퍼의 크기를 리턴한다.
	// 다음 루프에선 is의 맨 처음부터 다시 데이터를 읽는게 아니라 읽지않은 부분부터 데이터를 읽어 배열에 저장하게 된다.
	// 만약 마지막 루프에서 버퍼의 크기만큼 데이터가 딱 떨어지지 않고 채워지다 만다면 나머지 공간은 이전 루프의 데이터가 남아있게 된다.
	// ex) java라는 값을 byte[] readBytes = new byte[3]의 배열에
//	     int readCount = is.read(readBytes)로 호출하게 되면
	//   두번째 readCount = is.read(readBytes)에선 (a에 해당하는 바이트 - 정수)a00이 들어가게 되는게 아니라
	//   aav가 들어가게 되는것이다. 하지만 실제로 읽은 값은 하나이므로 readCount는 1로 들어가게된다.

//		--------- 추가 메모 ----------

	// read(byte[] b, int startIndex, int length) 로 메소드를 사용하게 되면 배열 b의 시작index와 길이를 계산한 공간에 읽어들인 데이터가
	// 저장되게 된다. 여기서 주의해야할 점은 시작인덱스부터의 length를 설정하기 때문에 length를 너무 높게 주어 배열의 크기를 벗어나면 Exception이 발생하므로 주의하자.

	// * result += new String(byte[] b, int startIndex, int length)
	//  바이트 배열의 해당 구간에 해당하는 바이트들을 문자열로 변환하여 result에 누적시키게 된다.

	// * new FileInputStream()은 fileNotFoundException을 처리해줘야 한다.
	//   read() 는 IOException을 처리해줘야 한다.
	//   IOException이 부모 예외이기 때문에 이것만 처리해줘도 예외가 발생하진 않게 된다.

	// --------바이트 기반 스트림 - 출력 ---------

	// 바이트 기반 스트림 - 출력
	// Output os = new FileOutputStream("");
	// 파일을 만들 경로와 파일이름.확장자를 ""에 넣어줘야 한다.
	// os.flush()
	// flush()메소드는 남아있는 버퍼를 지운다. => 출력 스트림에 버퍼링된 데이터를 강제로 내보내는 역할을 한다.
	// 이를 통해 버퍼에 남아 있는 데이터가 실제로 출력 장치나 파일 등에 기록되도록 보장한다.
	// os.close()
	// close()메소드는 스트림을 닫고, 스트림과 관련된 모든 시스템 자원을 해제한다.
	// 또한, 버퍼링된 출력 스트림의 경우, close() 메서드는 자동으로 flush()를 호출하여 버퍼에 남아 있는 데이터를 출력 장치나 파일에 기록한다.

	// os.write() 는 하나의 바이트를 출력스트림에 쓴다.
	// os.write(byte[] b)는 바이트배열 전체 출력스트림에 쓴다.
	// os.write(byte[] b, int startIndex, int length)로 해당 바이트배열의 특정 구간의 값을 가져와 출력스트림에 쓰게 된다.


	// --------- 문자 기반 스트림 Reader와 Writer ----------

	// ------- Reader 추상클래스의 FileReader("") ----------
	// 문자기반 스트림이기 때문에 char값을 처리하게 된다.
	// read() : 입력스트림에서 한글자를 읽는다.
	// read(char[] cBuf) : 입력스트림에서 문자를 읽어 cBuf에 데이터를 저장한다.
	// read(char[] cBuf, int startIndex, int length) : 입력스트림에서 문자를 해당하는 구간만큼 읽어 cBuf에 데이터를 저장한다.
	// 스트림의 끝에 도달하게 되면 -1을 return하게 된다.

	// 버퍼의 크기는 1~8KB가 적절한 버퍼의 크기로 간주된다. 1KB -> 1024바이트
	// 작은 버퍼는 한 번에 읽고 쓸 수 있는 데이터의 양이 적기 때문에 스트림에서 데이터를 처리하기 위해 더 많은 시스템 호출이 발생하게 된다.
	// 기본 인코딩이 UTF-8로 설정되어 있을 경우 한글은 한글자당 3byte씩 계산된다.


	// ---------- Writer 추상클래스의 FileWriter("") -------------
	// write() 를 사용하면 파일을 열고 데이터를 기존 내용 뒤에 추가하는 형태로 동작하게 된다.
	// 기본적으론 FileWriter("")로 생성한 객체의 write()는 이어써지는 형태로 동작하지만 
	// 만약 FileWriter("", boolean append) 여기서 두번째 인자로 false를 넣어 생성한 객체의 write()는 
	// 기존의 파일 내용을 삭제시키고 새로 추가한 내용을 덮어쓰는 형태로 동작하게 된다. 기본적으론 true인 샘

	// 파일을 읽어와서 새 파일에 쓰는 형태로 복사가 가능하다.
	// 원리는 reader나 inputStream을 통해 읽을 파일 경로를 넣어주어 객체를 생성한다.
	// 적당한 버퍼 크기의 바이트, 문자 배열을 생성해준다.
	// int count = is.read(type [] buf)로 배열에 읽어들인 값을 저장하고 리턴값을 count에 저장한다.
	// writer나 outputStream을 통해 쓸 파일 경로를 넣어주어 객체를 생성한다.
	// os.write(buf, 0, count)를 통해 읽어들인 데이터가 저장된 배열을 출력스트림에 쓰게된다.
	// 이과정을 반복문을 통해서 스트림의 끝에 닿을때까지 반복시키도록 해주면 모든 데이터를 읽어와 새 파일에 출력하는 동작을 구현할 수 있다.


	// -------- 보조 스트림 BufferedStream ----------
	// Java I/O에서 성능을 향상시키기 위해 사용되는 보조 스트림 클래스이다.
	// 이 클래스는 데이터를 버퍼에 일시적으로 저장하여 입출력 작업을 더 효율적으로 수행한다.

	// 사용 방법
	// Reader reader = new FileReader("");
	// BufferedReader bReader = new BufferedReader(reader) -> 주 스트림객체를 보조스트림 객체의 매개변수로 넣어줌
	// char[] cBuf = new char[1024];
	// readCount = bReader.read(cBuf); -> 보조스트림의 메소드를 사용해줌

	// ... 
	// reader.close();
	// bReader.close();  -> close() 시켜주는 순서는 상관없음.    

	// -> 주스트림과 보조스트림을 생성하고 보조스트림의 메소드를 활용하는 것이 특징이다!!


	// --------- File 객체 ------------

	// 파일이나 디렉토리의 경로명을 캡슐화하여 관리하는 데 사용된다.
	// 이 클래스는 파일이나 디렉토리를 생성, 삭제, 이동, 이름 변경 등의 작업을 수행하는 데 사용된다.
	// boolean exists() : 파일이나 디렉토리가 존재하는지 여부를 반환
	// boolean isFile() : 파일인지 여부를 반환
	// boolean isDirecory() : 디렉토리인지 여부를 반환
	// boolean createNewFile() : 새 파일을 생성
	// boolean mkdir() : 새 디렉토리를 생성
	// boolean delete() : 파일이나 디렉토리를 삭제
	// String[] list() : 디렉토리 내의 파일과 하위 디렉토리 목록을 문자열 배열로 반환
	// File[] listFiles() : 디렉토리 내의 파일과 하위 디렉토리를 File 객체 배열로 반환
	// boolean renameTo(File dest) : 파일이나 디렉토리의 이름을 변경하거나 이동

	// 이처럼 파일에 대한 처리를 할 수 있는 객체로 File을 쓸 수 있다
}
