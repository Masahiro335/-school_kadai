import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren4_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren4_2 extends Applet implements MouseListener,ActionListener
{
	PopupMenu pop;
	MenuItem m1,m2,m3,m4;
	Label label;
	public void init()
	{
		setLayout(new FlowLayout());
		pop = new PopupMenu("̧��");
		m1 = new MenuItem("�V�K�쐬");
		m1.addActionListener(this);
		pop.add(m1);
		m2 = new MenuItem("�J��");
		m2.addActionListener(this);
		pop.add(m2);
		m3 = new MenuItem("����");
		m3.addActionListener(this);
		pop.add(m3);
		m4 = new MenuItem("�I��");
		m4.addActionListener(this);
		pop.add(m4);
		add(pop);
		label = new Label("�@�@�@�@�@");
		add(label);
		addMouseListener(this);	
	}	
	public void actionPerformed(ActionEvent e)
	{
		Object item = e.getSource();
		if(item==m1)						//[�V�K�쐬]���I�����ꂽ�ۂ̏���
		{
			label.setText("�V�K�쐬");
		}
		else if(item==m2)					//[�J��]���I�����ꂽ�ۂ̏���
		{
			label.setText("�J��");
		}
		else if(item==m3)					//[����]���I�����ꂽ�ۂ̏���
		{
			label.setText("����");
		}
		else								//[�I��]���I�����ꂽ�ۂ̏���
		{
			label.setText("�I��");
		}
	}	
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e)
	{
		if(e.getModifiers()==InputEvent.BUTTON3_MASK)
		{
			//�E�د��Ȃ�ϳ��߲���̈ʒu���߯�߱����ƭ���\������
			pop.show(this,e.getX(),e.getY());
		}
	}
}


