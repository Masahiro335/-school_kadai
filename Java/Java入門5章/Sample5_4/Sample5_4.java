class Kadai5_4_1
{
	byte p1,p2;
	int k5_4()
	{
		return p1+p2;
	}
}

class Kadai5_4_2 extends Kadai5_4_1
{
	int k5_4()
	{
		return p1-p2;
	}
}

class Kadai5_4_3 extends Kadai5_4_2
{
	int k5_4()
	{
		return p1*p2;
	}
}

class Kadai5_4_4 extends Kadai5_4_3
{
	int k5_4()
	{
		return p1/p2;
	}
}

class Sample5_4
{
	public static void main(String args[])
	{
		Kadai5_4_1 c;						//Kadai5_4_4�N���X�̃C���X�^���X�𐶐�����
		char r = args[1].charAt(0);			//���ް�ނ�����͂��ꂽ���Z�q��char�^�ɕϊ�����
		switch(r)
		{
			case	'+':	//���Z
				c = new Kadai5_4_1();		//+�Ȃ�Kadai5_4_1�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'-':	//���Z
				c = new Kadai5_4_2();		//-�Ȃ�Kadai5_4_2�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'x':	//��Z
				c = new Kadai5_4_3();		//x�Ȃ�Kadai5_4_3�׽�̲ݽ�ݽ�𐶐�����
				break;
			case	'/':	//���Z
				c = new Kadai5_4_4();		//���Ȃ�Kadai5_4_4�׽�̲ݽ�ݽ�𐶐�����
				break;
			default:	//��L�ȊO
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		c.p1 = Byte.parseByte(args[0]);
		c.p2 = Byte.parseByte(args[2]);
		int kekka = c.k5_4();		//k5_4ҿ��ނ����s���A�������ʂ��f�B�X�v���C�ɕ\������
		//���Z���ʂ��f�B�X�v���C�ɕ\������
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);	
	}
}
