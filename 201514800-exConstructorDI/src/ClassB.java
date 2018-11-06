
public class ClassB {
	
	ClassA classA;
	 public ClassB(ClassA classA) {
	  this.classA = classA;
	 }
	 // 컨스드럭트 라고함 위에
	 public void methodB() {
	  System.out.println("ClassB depends on "+classA.methodA());
	 }
}
