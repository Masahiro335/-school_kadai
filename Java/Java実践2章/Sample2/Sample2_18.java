import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_18.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_18 extends Applet implements ActionListener
{
	Button button1,button2,button3;
	CardLayout c = new CardLayout(20,100);
	public void init()
	{
		setLayout(c);		//setLayoutҿ��ނ����s��CardLayout���w�肷��
		button1 = new Button("Button1");
		button2 = new Button("Button2");
		button3 = new Button("Button3");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		add(button1,"Button1");
		add(button2,"Button2");
		add(button3,"Button3");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			c.show(this,"Button2");		//Button1���د����ꂽ��Button2��\��
		}
		else if(e.getSource()==button2)
		{
			c.show(this,"Button3");		//Button2���د����ꂽ��Button3��\��
		}
		else
		{
			c.show(this,"Button1");		//Button3���د����ꂽ��Button1��\��
		}
	}
}

