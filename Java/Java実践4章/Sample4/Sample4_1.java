import java.awt.*;
import java.awt.event.*;

class Sample4_1
{
	public static void main(String args[])
	{
		Sample4_1_1 frame = new Sample4_1_1("Sample4_1");
		frame.setSize(250,250);	//�ڰѻ��ނ��w�肷��
		frame.setVisible(true);	//�ڰт�\������
	}
}	
class Sample4_1_1 extends Frame implements WindowListener
{
	Sample4_1_1(String title)
	{
		super(title);							//Frame�����ق�\������
		Label label = new Label("Java Frame");	//Label�׽�̵�޼ު�Ă𐶐�����
		add(label);								//���ق��ڰтɒǉ�����
		addWindowListener(this);				//�ڰт�WindowListener�ɓo�^����
	}
	//�ڰт���è�ޏ�ԂɂȂ����ۂɎ��s�����
	public void windowActivated(WindowEvent e){}
	//�ڰт�����ꂽ��Ɏ��s�����
	public void windowClosed(WindowEvent e){}
	//�ڰт������ۂɎ��s�����
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);		//���ع���݂��I������
	}
	//�ڰт���è�ޏ�ԂłȂ��Ȃ�Ǝ��s�����
	public void windowDeactivated(WindowEvent e){}
	//�ŏ���Ԃ���ʏ�̑傫���ɂȂ�Ǝ��s�����
	public void windowDeiconified(WindowEvent e){}
	//�ŏ���ԂɂȂ����ۂɎ��s�����
	public void windowIconified(WindowEvent e){}
	//�ڰт�����ԂɂȂ����ۂɎ��s�����
	public void windowOpened(WindowEvent e){}
}

