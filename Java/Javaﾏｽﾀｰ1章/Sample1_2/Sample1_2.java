class Sample1_2
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		if(p1>0 && p1<4)	
		{
			Interface1_2 c;		//�׽�ϐ���p�ӂ���
			switch(p1)			//���ް�ނ�����͂��ꂽ�l(��������)�ɂ�蕪�򂷂�
			{
				case 1:		//�������̏ꍇ
					c = new Kadai1_2_1();
					break;
				case 2:		//�o�����̏ꍇ
					c = new Kadai1_2_2();
					break;
				default:		//���̑�(�c�ƕ�)�̏ꍇ
					c = new Kadai1_2_3();
			}
			String kekka = c.r1_2();	//r1_2ҿ��ނ����s���A���ʂ��ި���ڲ�ɕ\������
			System.out.println(kekka);
		}
		else	//���ް�ނ�����͂��ꂽ�l��1����3�ȊO�̏ꍇ
		{
			System.out.println("�Y�����镔����������܂���");
		}
	}
}

//Interface�̐錾
interface Interface1_2
{
	int Shain[] = {10,3,17};	//�������ޖ��̎Ј���
	String r1_2();				//ҿ��ނ̐錾
}

//Kadai1_2_1�׽��Interface1_2���̧������������
class Kadai1_2_1 implements Interface1_2
{
	//�������̎Ј�����\������
	public String r1_2()
	{
		return "�������̎Ј���"+Shain[0]+"�l�ł��B";
	}
}	

//Kadai1_2_2�׽��Interface1_2���̪������������
class Kadai1_2_2 implements Interface1_2
{
	//�o�����̎Ј�����\������
	public String r1_2()
	{
		return "�o�����̎Ј���"+Shain[1]+"�l�ł��B";
	}
}

//Kadai1_2_3�׽��Interface1_2���̪������������
class Kadai1_2_3 implements Interface1_2
{
	//�c�ƕ��̎Ј�����\������
	public String r1_2()
	{
		return "�c�ƕ��̎Ј���"+Shain[2]+"�l�ł��B";
	}
}

