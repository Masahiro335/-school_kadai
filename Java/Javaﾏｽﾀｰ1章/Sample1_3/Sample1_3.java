class Sample1_3
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		if(p1>0 && p1<4)	
		{
			Interface1_3 c;		//�׽�ϐ���p�ӂ���
			switch(p1)			//���ް�ނ�����͂��ꂽ�l(��������)�ɂ�蕪�򂷂�
			{
				case 1:		//�������̏ꍇ
					c = new Kadai1_3_1();
					break;
				case 2:		//�o�����̏ꍇ
					c = new Kadai1_3_2();
					break;
				default:	//���̑�(�c�ƕ�)�̏ꍇ
					c = new Kadai1_3_3();
			}
			String kekka = c.r1_3(p2);	//r1_3ҿ��ނ����s���A���ʂ��ި���ڲ�ɕ\������
			System.out.println(kekka);
		}
		else	//���ް�ނ�����͂��ꂽ�l��1����3�ȊO�̏ꍇ
		{
			System.out.println("�Y�����镔����������܂���");
		}
	}
}

//Interface�̐錾
interface Interface1_3
{
	String r1_3(int a);
}

//Kadai1_3_1�׽��Interface1_3���̧������������
class Kadai1_3_1 implements Interface1_3
{
	//�������̎Ј�����\������
	public String r1_3(int a)
	{
		return "�������̎Ј���"+a+"�l�ł��B";
	}
}	

//Kadai1_3_2�׽��Kadai1_3_1���̪������������
class Kadai1_3_2 extends Kadai1_3_1
{
	//�o�����̎Ј�����\������
	public String r1_3(int a)
	{
		return "�o�����̎Ј���"+a+"�l�ł��B";
	}
}

//Kadai1_3_3�׽��Kadai1_3_1���̪������������
class Kadai1_3_3 extends Kadai1_3_1
{
	//�c�ƕ��̎Ј�����\������
	public String r1_3(int a)
	{
		return "�c�ƕ��̎Ј���"+a+"�l�ł��B";
	}
}

