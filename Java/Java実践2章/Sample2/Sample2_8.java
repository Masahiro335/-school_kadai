import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_8.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_8 extends Applet implements ItemListener
{
	Label label;
	Checkbox check1,check2,check3;
	public void init()
	{
		setLayout(null);		//Layout manager���g�p���Ȃ�
		Font font = new Font("Serif",Font.PLAIN,18);
		label = new Label("��������");
		label.setSize(80,20);
		label.setLocation(20,20);
		label.setFont(font);
		add(label);
		//Checkbox��޼ު�Ă𐶐�����
		check1 = new Checkbox("����Ȃ�",true);
		check2 = new Checkbox("�Α�");
		check3 = new Checkbox("����");
		//check1,2,3��ItemListener�ɓo�^
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		//check1,2,3�̻��ނƕ\���ʒu���w�肷��
		check1.setSize(80,20);
		check2.setSize(80,20);
		check3.setSize(80,20);
		check1.setLocation(20,60);
		check2.setLocation(20,80);
		check3.setLocation(20,100);
		//check1,2,3����گĂɒǉ�����
		add(check1);
		add(check2);
		add(check3);
	}
	public void itemStateChanged(ItemEvent e)
	{
		int ft = Font.PLAIN;				//̫�Ă�PLAIN�Ɏw�肷��
		if(e.getItemSelectable()==check1)	//����Ȃ��Ȃ�ȉ��̏������s��
		{
			if(check1.getState()==true)		//����Ȃ���������ԂȂ�ȉ��̏������s��
			{
				check2.setState(false);		//�Α̂���������
				check3.setState(false);		//��������������
			}
			else							//����Ȃ���������ԂȂ�ȉ��̏������s��
			{
				if(check2.getState()==false && check3.getState()==false)
				{
					//�Α̂��������������Ȃ�ȉ��̏������s��
					check1.setState(true);	//����Ȃ���������Ԃɂ���
				}
			}
		}
		else if(e.getItemSelectable()==check2)	//�Α̂Ȃ�ȉ��̏������s��
		{
			if(check2.getState()==true)			//�Α̂�������ԂȂ�ȉ��̏������s��
			{
				ft = Font.ITALIC;				//̫�Ă�ITALIC�Ɏw�肷��
				if(check3.getState()==true)		//������������ԂȂ�ȉ��̏������s��
				{
					ft+=Font.BOLD;				//̫�Ă�BOLD�Ɏw�肷��
				}
				check1.setState(false);			//����Ȃ��������ɂ���
			}
			else								//�Α̂���������ԂȂ�ȉ��̏������s��
			{
				if(check3.getState()==false)	//��������������ԂȂ�ȉ��̏������s��
				{
					check1.setState(true);		//����Ȃ���������Ԃɂ���
				}
				else
				{
					ft = Font.BOLD;
				}
			}
		}
		else if(e.getItemSelectable()==check3)	//�������د����ꂽ��ȉ��̏������s��
		{
			if(check3.getState()==true)			//������������ԂȂ�ȉ��̏������s��
			{
				ft = Font.BOLD;					//̫�Ă�BOLD�Ɏw�肷��
				if(check2.getState()==true)		//�Α̂�������ԂȂ�ȉ��̏������s��
				{
					ft +=Font.ITALIC;			//̫�Ă�ITALIC�Ɏw�肷��
				}
				check1.setState(false);			//����Ȃ��������ɂ���
			}
			else								//��������������ԂȂ�ȉ��̏������s��
			{	
				if(check2.getState()==false)	//�Α̂���������ԂȂ�ȉ��̏������s��
				{
					check1.setState(true);		//����Ȃ���������Ԃɂ���
				}
				else							//�Α̂�������ԂȂ�ȉ��̏������s��
				{
					ft = Font.ITALIC;			//̫�Ă�ITALIC�Ɏw�肷��
				}
			}
		}
		Font font = new Font("Serif",ft,18);	//��L�̌��ʂ𓥂܂�̫�Ă��w�肷��
		label.setFont(font);					//���ق�̫�Ă�ύX����
	}
}




