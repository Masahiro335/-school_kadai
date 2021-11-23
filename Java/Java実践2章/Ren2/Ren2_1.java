import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_1 extends Applet implements ActionListener,Runnable
{
	int count;		//�b��
	boolean stn;	//���گĂ̏��
	Button button;	
	public void init()
	{
		button = new Button("START");		//Button�׽�̵�޼ު�Ă𐶐�����
		button.addActionListener(this);		//START���݂�ActionListener�ɓo�^����
		add(button);						//START���݂���گĂɒǉ�����
	}
	public void paint(Graphics g)
	{
	    int t;		//�^�C��
	    int set=10;	//�����ݒ�
		if(count==0||stn==true)
		{
			g.drawString(set+"�b�o������STOP���݂������Ă�������",40,120);
		}
		else
		{
			if(0<count && count<set)
			{
				t = set-count;
				g.drawString(""+t+"�b����܂���",40,120);
			}
			else if(count>set)
			{
				t = count-set;
				g.drawString(""+t+"�b�I�[�o�[�ł�",40,120);
			}
			else if(count==set)
			{
				g.drawString("���x"+set+"�b�ł�",40,120);
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(button.getLabel()=="START")
		{
			//START���݂��د����ꂽ��ȉ��̏������s��
		    count = 0;					//�o�ߕb��������������
			stn = true;					//��Ԃ�[�b�����Ē�]�Ƃ���
			Thread t = new Thread(this);//�گ�ނ��쐬����
			t.start();					//�گ�ނ����s����
			button.setLabel("STOP");	//���݂�START����STOP�ɕύX
		}
		else
		{
			//STOP���݂��د����ꂽ��ȉ��̏������s��
			stn = false;				//��Ԃ�[�b�����Ē�]�Ƃ���
			button.setLabel("START");	//���݂�STOP����START�ɕύX
			repaint();			//�b�����Ē��ł���Εb�����ĕ\��
		}
	}
	public void run()
	{
		try
		{
			while(stn)
			{
				repaint();			//�b�����Ē��ł���Εb�����ĕ\��
				Thread.sleep(1000);	//1�b�ԑҋ@
				count++;			//�b�����X�V����
			}
		}
		catch(Exception e)
		{
			//��O���������Ă��Ȃɂ����Ȃ�
		}
	}
}





