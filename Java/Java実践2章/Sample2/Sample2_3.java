import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_3 extends Applet implements ActionListener
{
	Label label;
	Button button1,button2;
	public void init()
	{
		button1 = new Button("OK"); 		//Button1�׽�̵�޼ު�Ă𐶐�����
		button2 = new Button("Cancel"); 	//Button2�׽�̵�޼ު�Ă𐶐�����
		button1.addActionListener(this);	//OK���݂�ActionListener�ɓo�^����
		button2.addActionListener(this);	//Cancel���݂�ActionListener�ɓo�^����
		add(button1);						//OK���݂���گĂɒǉ�����
		add(button2);						//Cancel���݂���گĂɒǉ�����
		label = new Label("                      ");//Label�׽�̵�޼ު�Ă𐶐�����
		add(label);							//���ق���گĂɒǉ�����
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			label.setText("OK Button");	
			//OK���݂��د����ꂽ��OK Button�ƕ\��
		}
		else
		{
			label.setText("Cancel Button");	
			//Cancell���݂��د����ꂽ��Cancel Button�ƕ\��
		}
	}
}


