import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_3 extends Applet implements MouseListener
{
	Label label;
	public void init()
	{
		label = new Label("               ");//List�׽�̵�޼ު�Ă𐶐�����
		add(label);						//ؽĂ���گĂɒǉ�����
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e)	//Mouse�������Ǝ��s�����
	{
		if(e.getModifiers()==InputEvent.BUTTON1_MASK)
		{
			label.setText("���د�");
		}
		if(e.getModifiers()==InputEvent.BUTTON3_MASK)
		{
			label.setText("�E�د�");
		}
	}
	public void mouseReleased(MouseEvent e){}
}


