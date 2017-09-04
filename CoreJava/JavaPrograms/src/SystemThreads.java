
public class SystemThreads {
public static void main(String[] args) {
	ThreadGroup syThrad=Thread.currentThread().getThreadGroup().getParent();
	Thread[] threadGroup=new Thread[syThrad.activeCount()];
	syThrad.enumerate(threadGroup);
	for(Thread t1:threadGroup){
		System.out.println(t1+" demon : "+t1.isDaemon());
	}
}
}
