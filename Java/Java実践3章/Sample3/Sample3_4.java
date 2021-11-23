import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_4 extends Applet implements ActionListener,TextListener,KeyListener
{
	TextField text1;
	TextArea text2,text3;
	public void init()
	{
		text1 = new TextField(10);
		text2 = new TextArea(5,20);
		text3 = new TextArea(5,20);
		text1.setEchoChar('*');
		text1.addActionListener(this);
		text1.addActionListener(this);
		text1.addTextListener(this);
		text1.addKeyListener(this);
		add(text1);
		add(text2);
		add(text3);
	}
	public void actionPerformed(ActionEvent a)	//Enter���������Ǝ��s�����
	{
		text3.append("Enter key\n");			//���i��÷�Ĵر��Enter key�ƕ\������
	}
	public void textValueChanged(TextEvent a)	//÷��ٰ̨�ނ̓��e���ς��Ǝ��s�����
	{
		text2.append(text1.getText()+"\n");		//��i��÷�Ĵر��÷��ٰ̨�ނ̒l��\��
	}
	public void keyPressed(KeyEvent a)			//���������Ǝ��s�����
	{
		text3.append("Key Pressed\n");			//���i��÷�Ĵر��Key Pressed
		//���i��÷�Ĵر�ɷ����ނ�\������
		text3.append("Cord:"+a.getKeyCode()+"\n");
	}
	public void keyTyped(KeyEvent a)			//keyPressed�̌�Ɏ��s�����
	{
		text3.append("Key Typed\n");			//���i��÷�Ĵر��Key Typed�ƕ\������
	}
	public void keyReleased(KeyEvent a)			//��������Ǝ��s�����
	{
		text3.append("Key Released\n");			//text3��Key Released�ƕ\������
	}
}

