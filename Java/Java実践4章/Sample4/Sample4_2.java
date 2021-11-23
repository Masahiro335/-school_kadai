import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample4_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample4_2 extends Applet implements ActionListener
{
	Button button1,button2;
	Sample4_2_1 frame;
	public void init()
	{
		button1 = new Button("Show");
		button2 = new Button("Hide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);
		add(button2);
		frame = new Sample4_2_1("Sample4_2_1");
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
class Sample4_2_1 extends Frame implements WindowListener
{
	Sample4_2_1(String title)
	{
		super(title);							//Frame�����ق�\������
		setLayout(new FlowLayout());			//FlowLayoutӰ�ނɂ���
		Label label = new Label("Java Frame");	//Label�׽�̵�޼ު�Ă𐶐�����
		add(label);								//���ق��ڰтɒǉ�����
		addWindowListener(this);				//�ڰт�WindowListener�ɓo�^����
	}
	//�ڰт���è�ޏ�ԂɂȂ����ۂɎ��s�����
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Activated");
	}
	//�ڰт�����ꂽ��Ɏ��s�����
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Closed");
	}
	//�ڰт������ۂɎ��s�����
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		dispose();		//�ڰт�ؿ�����������
	}
	//�ڰт���è�ޏ�ԂłȂ��Ȃ�Ǝ��s�����
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Deactivated");
	}
	//�ŏ���Ԃ���ʏ�̑傫���ɂȂ�Ǝ��s�����
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Deiconified");
	}
	//�ŏ���ԂɂȂ����ۂɎ��s�����
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Iconified");
	}
	//�ڰт�����ԂɂȂ����ۂɎ��s�����
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Opened");
	}
}

