import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_13.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_13 extends Applet implements AdjustmentListener
{
	Label label;
	Scrollbar scroll;
	public void init()
	{
		setLayout(null);
		label = new Label("1");
		label.setSize(50,20);
		label.setLocation(20,20);
		add(label);
		//Scrollbar�׽�̵�޼ު�Ă𐶐�����
		scroll = new Scrollbar(Scrollbar.HORIZONTAL,1,1,1,201);
		scroll.setSize(200,20);
		scroll.setLocation(20,80);
		scroll.addAdjustmentListener(this);
		add(scroll);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		//��۰��ް���ς������ȉ��̏������s�Ȃ�
		label.setText(""+scroll.getValue());	//��۰��ް�̒l�����قɕ\������
	}
}




