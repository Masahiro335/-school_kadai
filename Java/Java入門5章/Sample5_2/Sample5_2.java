class Kadai5_2_1
{
	byte p1,p2;
	int k5_2_1()
	{
		return(p1+p2);
	}
}

class Kadai5_2_2 extends Kadai5_2_1
{
	int k5_2_2()
	{
		return(p1-p2);
	}
}

class Kadai5_2_3 extends Kadai5_2_2
{
	int k5_2_3()
	{
		return(p1*p2);
	}
}

class Kadai5_2_4 extends Kadai5_2_3
{
	int k5_2_4()
	{
		return(p1/p2);
	}
}

class Sample5_2
{
	public static void main(String args[])
	{
		int kekka;
		Kadai5_2_4 c = new Kadai5_2_4();	//Kadai5_2_4�N���X�̃C���X�^���X�𐶐�����
		c.p1 = Byte.parseByte(args[0]);		//�L�[�{�[�h������͂��ꂽ�l��byte�^�ɕϊ�����
		char r = args[1].charAt(0);			//�L�[�{�[�h������͂��ꂽ�l��char�^�ɕϊ�����
		c.p2 = Byte.parseByte(args[2]);		//�L�[�{�[�h������͂��ꂽ�l��byte�^�ɕϊ�����
		switch(r)
		{
			case	'+':	//���Z
				kekka = c.k5_2_1();		//���Z���s��k5_2_1ҿ��ނ����s����
				break;
			case	'-':	//���Z
				kekka = c.k5_2_2();		//���Z���s��k5_2_2ҿ��ނ����s����
				break;
			case	'x':	//��Z
				kekka = c.k5_2_3();		//��Z���s��k5_2_3ҿ��ނ����s����
				break;
			case	'/':	//���Z
				kekka = c.k5_2_4();		//���Z���s��k5_2_4ҿ��ނ����s����
				break;
			default:	//��L�ȊO
				System.out.println("�v�Z�ł��܂���");
				return;
		}
		//���Z���ʂ��f�B�X�v���C�ɕ\������
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
		
	}
}
