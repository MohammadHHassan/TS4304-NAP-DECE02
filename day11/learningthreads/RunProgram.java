package day11.learningthreads;

public class RunProgram
{
	public static void main(String[] args)
	{
		Message msg1 = new Message("Mohammad");
		Message msg2 = new Message("Haji");
		Message msg3 = new Message("Hassan");
		
		new Thread(msg1).start();		// Starting the thread for msg1
		new Thread(msg2).start();		// Starting the thread for msg2
		new Thread(msg3).start();		// Starting the thread for msg3
	}
}
