import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_7.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_7 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Java Applet",80,120); //Java Applet�Ƃ���������\������
		g.drawRect(60,80,100,70);
	}
}

