import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_2 extends Applet implements ActionListener
{
	Button button;
	public void init()
	{
		button = new Button("START");		//Button�׽�̵�޼ު�Ă𐶐�����
		button.addActionListener(this);		//START���݂�ActionListener�ɓo�^����
		add(button);						//START���݂���گĂɒǉ�����
	}
	public void actionPerformed(ActionEvent e)
	{
		if(button.getLabel()=="START")
		{
			button.setLabel("STOP");	//START����STOP���݂ɖ��O��ύX
		}
		else
		{
			button.setLabel("START");	//STOP���݂Ȃ�START���݂ɖ��O��ύX����
		}
	}
}


