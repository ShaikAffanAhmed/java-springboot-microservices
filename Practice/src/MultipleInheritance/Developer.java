package MultipleInheritance;

public class Developer implements FrontEndTech{

	public void learnJava() {
		System.out.println("Developer is learing Java");
	}
	
	@Override
	public void learnHtml() {
		System.out.println("Developer is learning Html");
	} 

}
