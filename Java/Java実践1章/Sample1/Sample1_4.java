import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_4 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Java Applet",80,120); //Java Applet�Ƃ���������\������
	}
	public void init()
	{
		setForeground(Color.red);
		setBackground(Color.green);
	}
}
