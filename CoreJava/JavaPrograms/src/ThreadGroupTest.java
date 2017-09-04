
public class ThreadGroupTest  extends Thread{

	public ThreadGroupTest(ThreadGroup ps,String name) {
      super(ps,name);
	}
	public void run(){
		System.out.println("childMethod");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadGroup t1=new ThreadGroup("ramesh");
		ThreadGroup t2=new ThreadGroup(t1,"kiran");
		ThreadGroupTest tst= new ThreadGroupTest(t1, "ChildGroup");
		ThreadGroupTest tst2=new ThreadGroupTest(t1, "childGroup2");
		tst.start();
		tst2.start();
		System.out.println(t1.activeCount());
		System.out.println(t1.activeGroupCount());
		t1.list();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
