import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_5a.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_5a extends Applet implements Runnable
{
	int i;
	int count;		//�b��
	boolean stn=true;	//���گĂ̏��	
	Button button[] = new Button[10];
	CardLayout c = new CardLayout(20,100);
	Color color[] = {Color.blue,Color.cyan,Color.gray,Color.green,Color.magenta,Color.orange,
                 Color.pink,Color.red,Color.white,Color.yellow};
	public void init()
	{
		Thread t = new Thread(this);//�گ�ނ��쐬����
		t.start();
		setLayout(c);		//setLayoutҿ��ނ����s��CardLayout���w�肷��
		for(i=0; i<10; i++)
		{
			button[i] = new Button("Button"+(i+1));
			button[i].setBackground(color[i]);
			add(button[i],"Button"+(i+1));
		}
	}

	public void run()
	{
		try
		{
			while(stn)
			{
				Thread.sleep(1000);	//1�b�ԑҋ@
				c.next(this);
			}
		}
		catch(Exception e)
		{
			//��O���������Ă��Ȃɂ����Ȃ�
		}
	}
}

