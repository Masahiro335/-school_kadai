import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_16.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_16 extends Applet
{
	public void init()
	{
		//BorderLayout�׽�̵�޼ު�Ă𐶐�����
		BorderLayout bl = new BorderLayout(5,5);
		setLayout(bl);	//setLayoutҿ��ނ����s���ABorderLayout���w�肷��
		//Button�׽�̵�޼ު�Ă�5��������
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		add(button1,"North");	//button1����ɔz�u����
		add(button2,"South");	//button2�����ɔz�u����
		add(button3,"East");	//button3���E�[�ɔz�u����
		add(button4,"West");	//button4�����[�ɔz�u����
		add(button5,"Center");	//button5�𒆉��ɔz�u����
	}
}

