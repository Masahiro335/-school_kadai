import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_1 extends Applet implements MouseListener,MouseMotionListener
{
	List list;
	public void init()
	{
		list = new List(15);			//List�׽�̵�޼ު�Ă𐶐�����
		add(list);						//ؽĂ���گĂɒǉ�����
		addMouseListener(this);			//MouseListener�ɓo�^����
		addMouseMotionListener(this);	//MouseMotionListener�ɓo�^����
	}
	public void mouseClicked(MouseEvent e)	//Mouse��Click����Ǝ��s�����
	{
		list.add("Clicked");
	}
	public void mouseEntered(MouseEvent e)	//Mouse��Applet�̒��Ɉړ�����Ǝ��s�����
	{
		list.add("Entered");
	}
	public void mouseExited(MouseEvent e)	//Mouse��Applet�̊O�Ɉړ�����Ǝ��s�����
	{
		list.add("Exited");
	}
	public void mousePressed(MouseEvent e)	//Mouse�������Ǝ��s�����
	{
		list.add("Pressed");
	}
	public void mouseReleased(MouseEvent e)	//MousePressed�̌��Mouse�𗣂��Ǝ��s�����
	{
		list.add("Released");
	}
	public void mouseDragged(MouseEvent e)	//Mouse���h���b�O����Ǝ��s�����
	{
		list.add("Dragged");
	}
	public void mouseMoved(MouseEvent e)	//Mouse���ړ�����Ǝ��s�����
	{
		//Mouse���ړ����邽�тɎ��s����邽��ؽĂɂ͉����Ȃ�
	}
}

