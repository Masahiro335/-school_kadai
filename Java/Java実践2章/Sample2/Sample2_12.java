import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_12.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_12 extends Applet implements ItemListener
{
	Label label;
	List list;
	public void init()
	{
		//Font�׽�̵�޼ު�Ă𐶐�����
		Font font = new Font("Serif",Font.PLAIN,24);
		//Label�׽�̵�޼ު�Ă𐶐����A���گĂɒǉ�����
		label = new Label("Color");
		label.setFont(font);
		add(label);
		list = new List();
		//ؽĂ�4�̑I�����ڂ�o�^����
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.addItemListener(this);
		add(list);
		list.select(2);
		label.setForeground(Color.blue);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//���د����ꂽ��ȉ��̏������s�Ȃ�
		if(list.getSelectedItem()=="��")
		{
			label.setForeground(Color.black);	     //���ق̕��������F�ɂ���
			label.setText(list.getSelectedItem());   //���ق̕��������ɂ���
		}
		else if(list.getSelectedItem()=="��")
		{
			label.setForeground(Color.red);			//���ق̕�����ԐF�ɂ���
			label.setText(list.getSelectedItem());  //���ق̕�����Ԃɂ���
		}
		else if(list.getSelectedItem()=="��")
		{
			label.setForeground(Color.blue);		//���ق̕�����F�ɂ���
			label.setText(list.getSelectedItem());  //���ق̕�����ɂ���
		}
		if(list.getSelectedItem()=="��")
		{
			label.setForeground(Color.green);		//���ق̕�����ΐF�ɂ���
			label.setText(list.getSelectedItem());  //���ق̕�����΂ɂ���
		}
	}
}



