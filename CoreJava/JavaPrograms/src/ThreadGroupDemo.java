
public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup t1= new ThreadGroup("Ramesh");
		System.out.println(t1.getMaxPriority());
		ThreadGroup t2= new ThreadGroup(t1,"childGroup");
		System.out.println(t2.getMaxPriority());
		t1.setMaxPriority(3);
		ThreadGroup t3= new ThreadGroup(t1,"childGroup2");
		System.out.println(t3.getMaxPriority());
		System.out.println(t2.getMaxPriority());
		System.out.println(t1.getMaxPriority());
	}
}
