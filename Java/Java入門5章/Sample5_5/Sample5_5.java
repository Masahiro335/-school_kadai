//�{�N���X�͒��ۃN���X�Ƃ���
abstract class Kadai5_5
{
	byte p1,p2;		//�ݽ�ݽ�ϐ���錾����
	//ҿ��ޖ� : k5_5
	abstract int k5_5();
}

class Kadai5_5_1 extends Kadai5_5
{
	int k5_5()
	{
		return p1 + p2;
	}
}

class Kadai5_5_2 extends Kadai5_5
{
	int k5_5()
	{
		return p1 - p2;
	}
}

class Kadai5_5_3 extends Kadai5_5
{
	int k5_5()
	{
		return p1 * p2;
	}
}

class Kadai5_5_4 extends Kadai5_5
{
	int k5_5()
	{
		return p1 / p2;
	}
}

class Sample5_5
{
	public static void main(String args[])
	{
		Kadai5_5 c;					//Kadai5_5�̸׽�ϐ����`����
		char r = args[1].charAt(0);	//���ް�ނ�����͂��ꂽ���Z�q��char�^�ɕϊ�����
		switch(r)
		{
			case	'+':
				c = new Kadai5_5_1();	//+�Ȃ�Kadai5_5_1�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'-':
				c = new Kadai5_5_2();	//+�Ȃ�Kadai5_5_2�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'x':
				c = new Kadai5_5_3();	//+�Ȃ�Kadai5_5_3�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'/':
				c = new Kadai5_5_4();	//+�Ȃ�Kadai5_5_4�׽�̲ݽ�ݽ�𐶐�����
				break;
			default:
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		c.p1 = Byte.parseByte(args[0]);
		c.p2 = Byte.parseByte(args[2]);
		int kekka = c.k5_5();		//Kadai5_5ҿ��ނ����s���A�������ʂ��f�B�X�v���C�ɕ\������
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
	}
}


