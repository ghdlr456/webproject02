
public class TestConstructorDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ClassA classA = new ClassA();
		  //Constructor based Dependency Injection
		  ClassB classB = new ClassB(classA); //클래스 비가 클래스 에이로 전달
		  classB.methodB(); //메소드 비를 실행
		  
		  // 위에가 컨스드럭트 방식 의존성주입
	}
}
