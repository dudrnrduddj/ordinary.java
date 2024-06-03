
public class Note {
//----------- 제네릭------------
	
/**
 * 하나의 차모형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍 하는것
 * 주의! static 변수는 인스턴스 변수가 생성되기 이전에 생성된다.또한 static 메서도에선 인스턴스변수를 사용할 수 없다.
 * 그런데 T의 자료형이 정해지는 순간은 인스턴스가 생성되는 순간이기 때문에 static변수의 자료형이나 static메서드 내부에서 자료형으로 T를 사용할 수 없다!!
 * 
 * 제레릭은 결국 자료형을 Object로 써서 내부에서 다운캐스팅을 일일이 해주는 번거로움을 없앨 수 있는 장점이 있는 것
 * 컴파일 단계에서 제네릭의 자료형을 알아서 확인해주기 때문이다!!
 * 
 * 컬렉션 프레임워크에서 이러한 제네릭을 자주 사용한다.
 * 
 *-------------컬렉션-------------
 *
 *
 * 자바에서는 필요한 자료 구조를 미리 구현하여 java.util 패키지에서 제공하고 있는데, 이를 컬렉션 프레임워크라고 한다.
 * 자료구조 라이브러리 ..
 * 컬렉션 프레임워크의 전체 구조는 Collection 인터페이스와 Map 인터페이스 기반으로 이루어져 있다.
 * collection 인터페이스 : 하나의 자료를 모아서 관리하는데 필요한 기능을 제공
 * Map 인터페이스 : 쌍으로 된 자료들을 관리하는 데 유용한 기능을 제공
 * 
 * collection 인터페이스 - List : ArrayList, Vector, LinkedList .. /  Set : HashSet, TreeSet ..
 * 
 * List : 순서가 있는 자료 관리, 중복 허용
 * Set : 순서 X , 중복 허용 X
 * 
 * 
 * ---------List vs Set---------
 * 
 * 
 * List의 경우 인덱스가 존재하기 때문에 for문과 get()메소드를 통해 순차적으로 하나씩 추출하며 순회가 가능하다.
 * 하지만 Set의 경우 순서가 없는 자료구조이기 때문에 Iterator를 사용한다.
 * Iterator는 Collection 인터페이스를 구현한 객체에서 미리 정의되어있는 iterator()메소드를 호출하여 참조한다. 예를 들어
 * Collection을 구현한 ArrayList에 iterator()를 호출하면 Iterator 클래스가 반환되므로 변수에 대입해 사용한다.
 * ex) Iterator ir = memberArrayList.iterator();
 * 
 * Iterator를 사용하여 모든 요소를 순회할때 사용하는 메소드이다.
 * boolean hasNext() : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환.
 * E next() : 다음에 있는 요소를 반환.
 * 
 * set의 특징으로 데이터의 중복이 허용되지 않는다고 했는데 예제를 풀었을 때 
 * 		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("이세훈", 90, 80));
		studentSet.add(new Student("허태성", 88, 44));
		studentSet.add(new Student("남궁성", 78, 67));
		studentSet.add(new Student("이세훈", 90, 80));
		여기서 studentSet.size() 가 4가 나옴을 확인할 수 있다.
	이는 Student 객체 내에서 equals()와 hashcode()를 재정의 해주어 참조변수의 비교가 아닌 객체 안의 멤버값의 비교로 바꾸어 주어 원하는 기능을 수행하도록 할 수 있다.
	equals()와 hashcode()는 일종의 계약으로 아래의 특징이 있다.
		일관된 동작: 객체의 equals 메서드가 true를 반환하는 두 객체는 동일한 hashCode 값을 가져야 합니다. 
		즉, 두 객체가 논리적으로 동일하면(equals 메서드가 true를 반환하면) 동일한 해시 코드를 반환해야 합니다.
		
		동일한 해시 코드: 반대로, 동일한 hashCode 값을 가진 두 객체가 반드시 equals 메서드에서 true를 반환할 필요는 없습니다. 
		즉, 해시 코드가 같더라도 객체가 반드시 동일할 필요는 없지만, 다른 해시 코드를 가진 두 객체는 반드시 다른 객체로 취급됩니다.
		
		
		
	-------------Map--------------	
	
	
	Map : key - value의 쌍으로 이루어져 있음. key는 유일하며, value는 중복이 가능.
		
 * Map 인터페이스를 구현한 클래스는 내부적으로 해시 알고리즘에 의해 구현되어 있다.
 * index = hash(key) 와 같이 해시 방식의 자료를 저장하는 공간을 해시 테이블 이라 하는데 key가 정해지면 그에 대응하는 해시 테이블의 저장 위치가 정해지느데
 * 이런 위치를 계산하는 함수가 '해시함수'이다.
 * 
 * Map인터페이스에서 사용하는 key값은 중복될 수 없으므로 equals(), hashcode()를 재정의하여 사용하는 것이 좋다.
 * 
 * Map 또한 순서가 없는 자료구조이기 때문에 순회하기 위해서는 key값을 가져와서 그에 해당하는 value를 찾아야 한다.
 * 이 방법으로 Map<Stirng, String> hashMap = new hashMap<String, String>();
 * 	hashMap.keySet()메서드를 호출하면 모든 key값이 Set객체로 반환된다.
 * 따라서 iterator메서드를 활용할 수 있고 Iterator 객체를 반환받아 순회하면서 get(key)로 value를 가져오면 된다.
 * 	Iterator ir = map.keySet().iterator();
 * 	while(ir.hasNext()){
 * 		int key = ir.next();
 * 		Member member = hashMap.get(key);
 * 		Syetem.out.println(member);
 * 	}
 * 또는 HashMap의 values()를 사용하면 key값 없이 모든 value값을 Collection 자료형으로 반환해 준다.
 * 
 * key는 중복될 수 없으므로 반환형이 Set, value는 중복 가능하므로 Collection이 된다.
 * 
 * 
 */
}
