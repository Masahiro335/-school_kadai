//�{�N���X�͒��ۃN���X�Ƃ���
abstract class Ren5_2
{
	int Shain[] = {10,3,17};				//�������ޖ��Ј���
	abstract String r5_2(int r,int a);		//����ҿ���
}

class Ren5_2_1 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "�������̎Ј���"+Shain[a]+"�l�ł�";
	}
}

class Ren5_2_2 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "�o�����̎Ј���"+Shain[a]+"�l�ł�";
	}
}

class Ren5_2_3 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "�c�ƕ��̎Ј���"+Shain[a]+"�l�ł�";
	}
}

class RenMain5_2
{
	public static void main(String args[])
	{
		Ren5_2 c;
		int r = Integer.parseInt(args[0]);
		int a = r-1;
		switch(r)
		{
			case	1:
				c = new Ren5_2_1();	
				break;
			case	2:
				c = new Ren5_2_2();	
				break;
			case	3:
				c = new Ren5_2_3();	
				break;
			default:
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		String kekka = c.r5_2(r,a);
		System.out.println(kekka);
	}
}


