import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_5.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_5 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Java Applet",80,120); //Java Applet�Ƃ���������\������
	}
	public void init()
	{
		System.out.println("init");		//init���
	}
	public void start()
	{
		System.out.println("start");	//start���
	}
	public void stop()
	{
		System.out.println("stop");		//stop���
	}
	public void destroy()
	{
		System.out.println("destroy");	//destroy���
	}	
}
