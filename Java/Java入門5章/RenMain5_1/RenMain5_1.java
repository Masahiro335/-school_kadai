class Ren5_1_1
{
	String r5_1(int a)
	{
		return "�������̎Ј���"+a+"�l�ł��B";
	}
}

class Ren5_1_2 extends Ren5_1_1
{
	String r5_1(int a)
	{
		return "�o�����̎Ј���"+a+"�l�ł��B";
	}
}

class Ren5_1_3 extends Ren5_1_2
{
	String r5_1(int a)
	{
		return "�c�ƕ��̎Ј���"+a+"�l�ł��B";
	}
}

class RenMain5_1
{
	public static void main(String args[])
	{
		Ren5_1_1 c;
		int r = Integer.parseInt(args[0]);
		switch(r)
		{
			case	1:
				c = new Ren5_1_1();
				break;
			case	2:
				c = new Ren5_1_2();
				break;
			case	3:
				c = new Ren5_1_3();
				break;
			default:
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		int a = Integer.parseInt(args[1]);
		String kekka = c.r5_1(a);
		System.out.println(kekka);
	}
}

