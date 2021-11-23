import java.awt.*;
import java.awt.event.*;

class Sample4_6
{
	public static void main(String args[])
	{
		Sample4_6_1 frame = new Sample4_6_1("Sample4_6");
		frame.setSize(250,250);
		frame.setVisible(true);
	}
}

class Sample4_6_1 extends Frame implements ActionListener,MouseListener
{
	Label label;
	PopupMenu pop;
	MenuItem m1,m2,m3,m4;
	Sample4_6_1(String title)
	{
		super(title);
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
		label = new Label("      ");
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
			System.exit(0);
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


