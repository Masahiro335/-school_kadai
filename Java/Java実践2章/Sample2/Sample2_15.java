import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_15.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_15 extends Applet
{
	public void init()
	{
		//FlowLayout�׽�̵�޼ު�Ă𐶐�����
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,10);
		setLayout(fl);	//setLayoutҿ��ނ����s���AFlowLayout���w�肷��
		for(int i=0; i<50; i++)
		{
			add(new TextField());	//÷��̨���ނ���گĂɒǉ�����
		}
	}
}
