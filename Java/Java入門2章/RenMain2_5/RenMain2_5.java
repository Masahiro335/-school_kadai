class RenMain2_5
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//���ް�ނ�����͂��ꂽ�l��byte�^�ɕϊ�����
		byte j = Byte.parseByte(args[1]);
		Ren2_5 c=new Ren2_5();				//Ren2_5�׽�̲ݽ�ݽ�𐶐�����
		c.r2_5(i,j); 						//r2_5ҿ��ނ����s����
		System.out.println(i+"+"+j+"="+c.kekka);
	}
}

class Ren2_5
{
	 /*ҿ��ޖ�	�FRen2_5
	  �ÓI�ϐ�	�F�Ȃ�
	  �ݽ�ݽ�ϐ��Fint kekka
	  ҿ��ޖ�	�Fr2_5
	  �����T�v	�F����p1�ƈ���p2�̉��Z���ʂ�ݽ�ݽ�ϐ�kekka�ɐݒ肷��
	  ����		�Fp1:0����127�܂ł̐��l
	  			  p2:0����127�܂ł̐��l
	  �߂�l	�F�Ȃ�*/ 
	int kekka;
	void r2_5(byte p1,byte p2)
	{
		kekka = p1 + p2;
	}
}


