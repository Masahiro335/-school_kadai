import java.awt.*;
import java.awt.event.*;

class Sample4_3
{
	public static void main(String args[])
	{
		Sample4_3_1 frame = new Sample4_3_1("Sample4_3");
		frame.setSize(250,250);		//�ڰт̻��ނ��w�肷��
		frame.setVisible(true);		//�ڰт�\������
	}
}

class Sample4_3_1 extends Frame implements ActionListener
{
	Label label;
	MenuItem m1,m2,m3,m4;
	Sample4_3_1(String title)
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
			System.exit(0);
		}
	}
}


