import java.awt.*;
import java.awt.event.*;

class Sample4_7
{
	public static void main(String args[])
	{
		Sample4_7_1 frame = new Sample4_7_1("Sample4_7");
		frame.setSize(250,250);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);		//�ڰт�����ꂽ����ع���݂��I������
			}
		});
		frame.setVisible(true); 	//�ڰт�\������
	}
}
class Sample4_7_1 extends Frame implements ActionListener
{
	Checkbox check1,check2;
	Sample4_7_1(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		Button button = new Button("Dialog");
		button.addActionListener(this);
		CheckboxGroup g = new CheckboxGroup();
		check1 = new Checkbox("Ӱ���",g,true);
		check2 = new Checkbox("Ӱ��ڽ",g,false);
		add(button);		//�ڰт�Dialog���݂�ǉ�����
		add(check1);		//�ڰт�Ӱ������݂�ǉ�����
		add(check2);		//�ڰт�Ӱ��ڽ���݂�ǉ�����
	}
	public void actionPerformed(ActionEvent e)
	{
		//Dialog���݂��د����ꂽ��ȉ��̏������s��
		Sample4_7_2 dialog;
		if(check1.getState()==true)		//Ӱ��ق��޲�۸޵�޼ު�Ă𐶐�����
		{
			dialog = new Sample4_7_2(this,"Sample4_7_1",true);
		}
		else		//Ӱ��ڽ���޲�۸޵�޼ު�Ă𐶐�����
		{
			dialog = new Sample4_7_2(this,"Sample4_7_1",false);
		}
		dialog.setSize(150,150);
		dialog.setLocation(300,0);
		dialog.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);		//����޳������ꂽ����ع���݂��I������
			}
		});
		dialog.setVisible(true);	//�޲�۸��ޯ����\������
	}
}
class Sample4_7_2 extends Dialog implements ActionListener
{
	Button cancel;
	Sample4_7_2(Frame frame,String title, boolean mode)
	{
		super(frame,title,mode);		//�޲�۸��ޯ�������ق�\������
		setLayout(new FlowLayout());
		cancel = new Button("Cancel");
		add(cancel);					//Cancel���݂��޲�۸ނɒǉ�����
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)	//Cancel���݂��د����ꂽ��ȉ��̏������s��
	{
		setVisible(false);						//�޲�۸��ޯ�����\���ɂ���
	}
}


