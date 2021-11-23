import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample4_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample4_4 extends Applet implements ActionListener
{
	Button button1,button2;
	Sample4_4_1 frame;
	public void init()
	{
		button1 = new Button("Show");
		button2 = new Button("Hide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);
		add(button2);
		frame = new Sample4_4_1("Sample4_4_1");
		frame.setSize(250,250);
		frame.setLocation(300,0);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)		//Show���݂��د����ꂽ��ȉ��̏������s�Ȃ�
		{
			frame.setVisible(true);		//�ڰт�����Ԃɂ���
		}
		else							//Hide���݂��د����ꂽ��ȉ��̏������s�Ȃ�
		{
			frame.setVisible(false);	//�ڰт�����Ԃɂ���
		}
	}
}

class Sample4_4_1 extends Frame implements ActionListener
{
	Label label;
	MenuItem m1,m2,m3,m4;
	Sample4_4_1(String title)
	{
		super(title);
		MenuBar mb = new MenuBar();		//��޼ު�č쐬
		setMenuBar(mb);					//�ڰт��ƭ��ް��ǉ�����
		Menu me = new Menu("̧��");		//Menu�׽�̵�޼ު�Ă𐶐�����
		mb.add(me);						//�ƭ��ް��̧�قƂ������ڂ�ǉ�����
		m1 = new MenuItem("�V�K�쐬");	//[�V�K�쐬]���ƭ����ڂ��쐬����
		m1.addActionListener(this);		//[�V�K�쐬]��ActionListener��o�^����
		me.add(m1);						//[�V�K�쐬]���ƭ��ɒǉ�����
		m2 = new MenuItem("�J��");
		m2.addActionListener(this);
		me.add(m2);
		m3 = new MenuItem("����");
		m3.addActionListener(this);
		me.add(m3);
		me.addSeparator();				//[����]��[�I��]�̊Ԃɾ��ڰ���ǉ�����
		m4 = new MenuItem("�I��");
		m4.addActionListener(this);
		me.add(m4);
		label = new Label();
		add(label);						//���ق��ڰтɒǉ�����
	}
	//��ۯ���޳��ƭ����獀�ڂ��I�����ꂽ�ꍇ
	public void actionPerformed(ActionEvent e)
	{
		Object item = e.getSource();	//��޼ު�Ă��擾����
		if(item==m1)					//[�V�K�쐬]���I�����ꂽ�ۂ̏���
		{
			label.setText("�V�K�쐬���I������܂���");
		}
		else if(item==m2)				//[�J��]���I�����ꂽ�ۂ̏���
		{
			label.setText("�J�����I������܂���");
		}
		else if(item==m3)				//[����]���I�����ꂽ�ۂ̏���
		{
			label.setText("���邪�I������܂���");
		}
		else							//[�I��]���I�����ꂽ�ۂ̏���
		{
			dispose();
		}
	}
}


