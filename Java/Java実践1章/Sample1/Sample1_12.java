import java.applet.*;
import java.awt.*;
import java.util.*;

/*<APPLET
	CODE=Sample1_12.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>*/

public class Sample1_12 extends Applet
{
	public void paint(Graphics g)
	{
		Date d = new Date();				//���t�Ǝ������擾����
		g.drawString(d.toString(),40,120);	//���t�Ǝ�����\������
	}
}

