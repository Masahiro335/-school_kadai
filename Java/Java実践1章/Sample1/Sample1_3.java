import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_3 extends Applet
{
	public void paint(Graphics g)
	{
		Dimension d = getSize();				//���گĂ̻��ނ���������
		g.drawString("���F"+d.width,10,60);		//���گĂ̕��ƍ�����\������
		g.drawString("�����F"+d.height,10,100);			
	}
}

