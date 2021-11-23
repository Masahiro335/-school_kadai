import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_9.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_9 extends Applet implements ItemListener
{
	Label label;
	Checkbox option1,option2,option3,option4;
	public void init()
	{
		setLayout(null);								//Layout manager���g�p���Ȃ�
														//Font�׽�̵�޼ު�Ă𐶐�����
		Font font = new Font("Serif",Font.PLAIN,24);	
		label = new Label("Color");						//Label�׽�̵�޼ު�Ă𐶐�����
		label.setSize(80,20);							//���ق̻��ނ��w�肷��
		label.setLocation(20,20);						//���ق̕\���ʒu���w�肷��
		label.setFont(font);							//���ق�̫�Ă��w�肷��
		add(label);										//���ق���گĂɒǉ�����
														//CheckboxGroup�׽�̵�޼ު�Ă𐶐�����
		CheckboxGroup group = new CheckboxGroup();
		option1 = new Checkbox("��",group,true);		//Checkbox�׽�̵�޼ު�Ă�4��������
		option2 = new Checkbox("��",group,true);
		option3 = new Checkbox("��",group,true);
		option4 = new Checkbox("��",group,true);
		option1.addItemListener(this);					//4��׼޵���݂�ItemListener
		option2.addItemListener(this);
		option3.addItemListener(this);
		option4.addItemListener(this);
		option1.setSize(40,20);							//׼޵���݂̻��ނ��w�肷��
		option2.setSize(40,20);
		option3.setSize(40,20);
		option4.setSize(40,20);
		option1.setLocation(20,60);						//׼޵���݂̕\���ʒu���w�肷��
		option2.setLocation(20,80);
		option3.setLocation(20,100);
		option4.setLocation(20,120);
		add(option1);									//׼޵���݂���گĂɒǉ�����
		add(option2);
		add(option3);
		add(option4);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//׼޵���݂��د����ꂽ��ȉ��̏������s�Ȃ�
		if(e.getItemSelectable()==option1)
		{
			label.setForeground(Color.black);		//�������݂Ȃ當���̐F�����ɂ���
		}
		else if(e.getItemSelectable()==option2)
		{
			label.setForeground(Color.red);			//�Ԃ����݂Ȃ當���̐F��Ԃɂ���
		}
		else if(e.getItemSelectable()==option3)
		{
			label.setForeground(Color.blue);		//�����݂Ȃ當���̐F��ɂ���
		}
		else
		{
			label.setForeground(Color.green);		//�΂����݂Ȃ當���̐F��΂ɂ���
		}
	}
}
