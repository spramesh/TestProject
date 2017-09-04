
public class Thread1 {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//System.out.println(Thread.currentThread().getName());
	
		/*System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());*/
		
		ThreadGroup tg= new ThreadGroup("Ramesh");
		System.out.println(tg.getParent().getName());
		ThreadGroup second = new ThreadGroup(tg, "Varma");
		System.out.println(second.getParent().getName());
		
		
	}
}
