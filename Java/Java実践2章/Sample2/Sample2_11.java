import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_11.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_11 extends Applet implements ItemListener
{
	Label label;
	Choice choice;
	public void init()
	{
		setLayout(null);	//Layout Manager��OFF�ɂ���
		//Font�׽�̵�޼ު�Ă𐶐�����
		Font font = new Font("Serif",Font.PLAIN,24);
		//Label�׽�̵�޼ު�Ă𐶐����A���گĂɒǉ�����
		label = new Label("Color");
		label.setSize(80,20);
		label.setLocation(20,20);
		label.setFont(font);
		add(label);
		//Choice�׽�̵�޼ު�Ă𐶐�����
		choice = new Choice();
		//������4�̑I�����ڂ�o�^����
		choice.add("��");
		choice.add("��");
		choice.add("��");
		choice.add("��");
		choice.addItemListener(this);
		choice.setSize(40,20);
		choice.setLocation(100,20);
		add(choice);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//�������د����ꂽ��ȉ��̏������s�Ȃ�
		if(choice.getSelectedItem()=="��")
		{
			label.setForeground(Color.black);		//���ق̕��������F�ɂ���
			label.setText(choice.getSelectedItem()); //���ق̕��������ɂ���
		}
		else if(choice.getSelectedItem()=="��")
		{
			label.setForeground(Color.red);			//���ق̕�����ԐF�ɂ���
			label.setText(choice.getSelectedItem());//���ق̕�����Ԃɂ���
		}
		else if(choice.getSelectedItem()=="��")
		{
			label.setForeground(Color.blue);		//���ق̕�����F�ɂ���
			label.setText(choice.getSelectedItem());//���ق̕�����ɂ���
		}
		if(choice.getSelectedItem()=="��")
		{
			label.setForeground(Color.green);		//���ق̕�����ΐF�ɂ���
			label.setText(choice.getSelectedItem());//���ق̕�����΂ɂ���
		}
	}
}


