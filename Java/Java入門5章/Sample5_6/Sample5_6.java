//�{�N���X�͒��ۃN���X�Ƃ���
abstract class Kadai5_6
{
	byte p1,p2;		//�ݽ�ݽ�ϐ���錾����
	//ҿ��ޖ� : k5_6_21
	void k5_6_1(byte a,byte b)
	{
		p1 = a;
		p2 = b;
	}
	//�{ҿ��ނͻ�޸׽���ŋ@�\����������
	abstract int k5_6_2();
}

class Kadai5_6_1 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 + p2;
	}
}

class Kadai5_6_2 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 - p2;
	}
}

class Kadai5_6_3 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 * p2;
	}
}

class Kadai5_6_4 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 / p2;
	}
}

class Sample5_6
{
	public static void main(String args[])
	{
		Kadai5_6 c;					//Kadai5_6�̸׽�ϐ����`����
		char r = args[1].charAt(0);	//���ް�ނ�����͂��ꂽ���Z�q��char�^�ɕϊ�����
		switch(r)
		{
			case	'+':
				c = new Kadai5_6_1();	//+�Ȃ�Kadai5_6_1�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'-':
				c = new Kadai5_6_2();	//-�Ȃ�Kadai5_6_2�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'x':
				c = new Kadai5_6_3();	//x�Ȃ�Kadai5_6_3�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'/':
				c = new Kadai5_6_4();	//���Ȃ�Kadai5_6_4�׽�̲ݽ�ݽ�𐶐�����
				break;
			default:
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		byte p1 = Byte.parseByte(args[0]);
		byte p2 = Byte.parseByte(args[2]);
		c.k5_6_1(p1,p2);			//Kadai5_6�׽��k5_6_1ҿ��ނ����s����
		int kekka = c.k5_6_2();		//k5_6_2ҿ��ނ����s���A�������ʂ��f�B�X�v���C�ɕ\������
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
	}
}


