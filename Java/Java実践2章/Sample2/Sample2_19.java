import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_19.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_19 extends Applet
{
	public void init()
	{
		Panel p1 = new Panel();			//÷��ٰ̨�ޗp��Panel�׽�̵�޼ު�Ă𐶐�����
		Panel p2 = new Panel();			//���ݗp��Panel�׽�̵�޼ު�Ă𐶐�����
		p1.setLayout(new GridLayout(2,2));	//setLayoutҿ��ނ����s����
		p2.setLayout(new GridLayout(2,2));	//setLayoutҿ��ނ����s����
		//TexFiled��޼ު�Ă�4�������A÷��̨���ޗp�����قɔz�u����
		TextField text1 = new TextField();
		TextField text2 = new TextField();
		TextField text3 = new TextField();
		TextField text4 = new TextField();
		p1.add(text1);
		p1.add(text2);
		p1.add(text3);
		p1.add(text4);
		Button command1 = new Button("Command1");	//Button��޼ު�Ă����قɔz�u����
		Button command2 = new Button("Command2");
		Button command3 = new Button("Command3");
		Button command4 = new Button("Command4");
		p2.add(command1);
		p2.add(command2);
		p2.add(command3);
		p2.add(command4);
		add(p2);		//���ݗp�����ق���گĂɒǉ�����
		add(p1);		//÷��ٰ̨�ޗp�����ق���گĂɒǉ�����
	}
}

