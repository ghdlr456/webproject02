
public class TestSetterDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ClassA classA = new ClassA();
		  ClassB classB = new ClassB();
		  //Setter based Dependency Injection
		  
		  classB.setClassA(classA); 
		  classB.methodB();
	}

}
