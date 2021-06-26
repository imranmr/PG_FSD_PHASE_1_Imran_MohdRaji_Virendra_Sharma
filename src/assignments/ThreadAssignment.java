package assignments;

public class ThreadAssignment extends Thread{
	public void run() {
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		System.out.println("running thread state is:"+ Thread.currentThread().getState());
		System.out.println("The thread group is:"+Thread.currentThread().getThreadGroup());
		System.out.println("The thread id is:"+Thread.currentThread().getId());
		System.out.println("Is my thread alive or not? :  "+Thread.currentThread().isAlive());
		System.out.println("Is my thread Daemon or not? :  "+Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadAssignment t1 = new ThreadAssignment();
		ThreadAssignment t2 = new ThreadAssignment();
		ThreadAssignment t3 = new ThreadAssignment();
		ThreadAssignment t4 = new ThreadAssignment();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t4.setPriority(NORM_PRIORITY);
		
		t3.setDaemon(true);
		
		
		System.out.println("Before start");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("After start");
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
	}

}
