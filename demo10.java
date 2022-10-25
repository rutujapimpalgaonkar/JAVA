class MyThread extends Thread
{
	public void run()
	{
		for(i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class demo10
{
	public static void main(String[] args)
	{
		Thread t=new Thread();
		t.start();
	}

}