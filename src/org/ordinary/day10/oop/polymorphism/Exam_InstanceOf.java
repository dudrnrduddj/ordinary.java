package org.ordinary.day10.oop.polymorphism;

class Car{}
class Sonata extends Car{}
class Genesis extends Car{}
class GV80 extends Genesis{}

public class Exam_InstanceOf {
	
	static void print(Car car) {
		// instanceof 연산자를 사용하면 다형성을 활용하는 상황에서 
		// 객체의 실제 타입에 따라 다르게 처리할 수 있다.
		
		// -chatGPT-
		// instanceof 연산자를 사용하여 객체가 실제로 어떤 클래스의 인스턴스인지 확인하는 것은 상속 계층 구조에서 객체의 타입을 판별할 때 매우 유용합니다.
		// 특히, 객체의 실제 타입에 따라 다르게 처리해야 하는 상황에서 적절히 사용하면 유용합니다.
		// 예를 들어, 다형성을 활용하는 코드에서 특정 타입의 객체에 대해 별도의 로직을 적용할 수 있습니다.
		// 따라서, GV80 객체가 Genesis 및 Car 타입에 대해서도 true를 반환하는 것은 정상적인 동작이며,
		// 이는 객체의 상속 계층 구조를 정확하게 반영하는 것입니다.
		
		// 만약 객체의 실제 타입이 검사할 클래스와 같거나, 객체의 클래스가 검사할 클래스의 서브클래스라면, instanceof 연산자는 true를 반환합니다.
		// 따라서 자기 자신의 클래스와 같을때 동작시키기 위해서는 아래와 같은 코드가 아닌 gv80비교가 genesis보다 위쪽에 있어야 올바른 동작을 할 것이다.
		if(car instanceof Sonata) {
			System.out.println("Sonata");
		}else if(car instanceof GV80) {		//gv80이 더 하위크래스이기때문에 genesis 앞에서 조건문을 받아야 동작하게 된다.
			System.out.println("GV80");		// 만약 뒤쪽에있다면 genesis를 비교할때 걸러져서 원하는 로직이 출력으로 나오지 않을것이다.
		}else if(car instanceof Genesis)
		{
			System.out.println("Genesis");
		}else {
			System.out.println("부릉부릉");
		}
	}
	
	public static void main(String[] args) {
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new GV80());
		
	}

}
