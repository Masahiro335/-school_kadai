import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_4 extends Applet implements ActionListener
{
	int i=0;
	Label label[] = new Label[5];
	String info[] = {"����ԍ�","�����@�@","�N��@�@","�d�b�ԍ�","���l�@�@"};
	TextField text[] = new TextField[10];
	public void init()
	{
		//FlowLayout�׽�̵�޼ު�Ă𐶐�����
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,10);
		setLayout(fl);	//setLayoutҿ��ނ����s���AFlowLayout���w�肷��
		for(i=0; i<5; i++)
		{
			label[i] = new Label(info[i]);
			add(label[i]);
			text[i] =new TextField(15);
			text[i].addActionListener(this);
			add(text[i]);
		}
	}
	public void actionPerformed(ActionEvent a)
	{
		for(i=0;i<5; i++)
		{
			if(a.getSource()==text[i])
			{
				if(i == 4)
				{
					text[0].requestFocusInWindow();
				}
				else
				{
					text[i+1].requestFocusInWindow();
				}
			}
		}
	}
}


