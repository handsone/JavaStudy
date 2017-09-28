public class Hello {
	public static void main (String args[]){
		System.out.println("这是一个简单的Java应用程序");
		Student stu = new Student();
		stu.speak("We are Students");
	}
}
class Student {
	public void speak(String S){
		System.out.println(S);
	}
}
