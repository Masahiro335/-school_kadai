import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_5.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_5 extends Applet implements ActionListener,Runnable
{
	Button button1,button2,button3;
	CardLayout c = new CardLayout(20,100);
	int count=0;
	boolean stn = true;
	public void init()
	{
		Thread t = new Thread(this);//�گ�ނ��쐬����
		t.start();
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
	public void run()
	{
		try
		{
			while(stn)
			{
				if(count==0)
				{
					button1.setBackground(Color.red);
					button2.setBackground(Color.red);
					button3.setBackground(Color.red);
				}
				
			    else if(count==1)
				{
					button1.setBackground(Color.green);
					button2.setBackground(Color.green);
					button3.setBackground(Color.green);
				}
				else
				{
					button1.setBackground(Color.yellow);
				    button2.setBackground(Color.yellow);
					button3.setBackground(Color.yellow);
					
				}
				Thread.sleep(1000);	//1�b�ԑҋ@
				count++;			//�b�����X�V����
				if(count>2)
				{
					count=0;
				}
			}
		}
		catch(Exception e)
		{
			//��O���������Ă��Ȃɂ����Ȃ�
		}
	}
}

