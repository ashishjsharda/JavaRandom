/**
 * Demo using Synchronization
 * @author ashish
 *
 */
class Sender{

	public void send(String msg)
	{
		System.out.println(msg);
		try
		{ 
			Thread.sleep(1000); 
		} 
		catch (Exception e) 
		{ 
			System.out.println("Thread  interrupted."); 
		} 
		System.out.println(" ------------Message sent is"+msg);
	}
}

class SendMsg extends Thread{

	Sender sender;
	String msg;
	public SendMsg(Sender sender,String msg)
	{
		this.sender=sender;
		this.msg=msg;
	}
	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {

		Sender sender=new Sender();
		SendMsg send=new SendMsg(sender,"Hello");
		SendMsg send2=new SendMsg(sender,"Bye");
		send.start();
		send2.start();
		send.join();
		send2.join();
	}

}
