import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_10.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_10 extends Applet implements ItemListener
{
	Label label1,label2;
	Checkbox option1,option2,option3,option4,option5,option6;
	public void init()
	{
		setLayout(null);		//LayoutManager��OFF�ɂ���
		//Label�׽�̵�޼ު�Ă�2�������A���گĂɓo�^����
		label1 = new Label("�j��");
		label2 = new Label("20�� ");
		label1.setSize(50,20);
		label2.setSize(50,20);
		label1.setLocation(20,10);
		label2.setLocation(100,10);
		add(label1);
		add(label2);
		//Checkboxgroup�׽�̵�޼ު�Ă�2��������
		CheckboxGroup group1 = new CheckboxGroup();	//����
		CheckboxGroup group2 = new CheckboxGroup();	//�N��
		//Checkboxgroup�׽(���ʗp)�̵�޼ު�Ă�2��������
		option1 = new Checkbox("�j��",group1,true);
		option2 = new Checkbox("����",group1,false);
		//Checkboxgroup�׽(�N��p)�̵�޼ު�Ă�4��������
		option3 = new Checkbox("10��",group2,false);
		option4 = new Checkbox("20��",group2,true);
		option5 = new Checkbox("30��",group2,false);
		option6 = new Checkbox("���̑�",group2,false);
		//6��׼޵���݂�ItemListener�ɓo�^����
		option1.addItemListener(this);
		option2.addItemListener(this);
		option3.addItemListener(this);
		option4.addItemListener(this);
		option5.addItemListener(this);
		option6.addItemListener(this);
		//6��׼޵���݂̻��ނ��w�肷��
		option1.setSize(60,20);
		option2.setSize(60,20);
		option3.setSize(60,20);
		option4.setSize(60,20);
		option5.setSize(60,20);
		option6.setSize(60,20);
		//6��׼޵���݂̕\���ʒu���w�肷��
		option1.setLocation(20,40);
		option2.setLocation(20,60);
		option3.setLocation(100,40);
		option4.setLocation(100,60);
		option5.setLocation(100,80);
		option6.setLocation(100,100);
		//6��׼޵���݂���گĂɒǉ�����
		add(option1);
		add(option2);
		add(option3);
		add(option4);
		add(option5);
		add(option6);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//�د����ꂽ׼޵���̵݂�޼ު�Ă���������
		Checkbox select = (Checkbox)e.getItemSelectable();
		if(select==option1||select==option2)
		{
			//���ʗp��׼޵���݂Ȃ�label1�ɐ��ʂ�ݒ肷��
			label1.setText(select.getLabel());
		}
		else
		{
			//�N��p��׼޵���݂Ȃ�label2�ɔN���ݒ肷��
			label2.setText(select.getLabel());
		}
	}
}

