import java.util.*;
class RenMain5_2
{
	public static void main(String args[])
	{
		int w = Integer.parseInt(args[0]);;
		Ren5_2 c = new Ren5_2(w);
		Thread t = new Thread(c);
		Date s = new Date();
		long a = s.getTime();
		t.start();
		try
		{
			t.join();
			Date e = new Date();
			long b =e.getTime();
			System.out.println("�گ�ނ����s����Ă���I������܂�"+(b-a)+"m�b�ł�");
		}
		catch(InterruptedException d)
		{
			return;
		}		
	}
}

class Ren5_2 implements Runnable
{
	int wt;		//�گ�ނ̑ҋ@�b��(mesec)
	Ren5_2(int d)
	{
		wt = d;	//�گ�ނ̑ҋ@�b����ݒ肷��
	}
	public void run()
	{
		try
		{
			Thread.sleep(wt); //wt�Ŏw�肳�ꂽ�b��(msec)�����ҋ@����
		}
		catch(InterruptedException d)
		{
			return;
		}
	}
}


