class RenMain2_2
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//���ް�ނ�����͂��ꂽ�l��byte�^�ɕϊ�����
		byte j = Byte.parseByte(args[1]);
		Ren2_2.r2_2(i,j);					//Ren2_2�׽��r2_2ҿ��ނ����s����
											//r2_2ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println(i+"+"+j+"="+Ren2_2.kekka);
	}	
}

class Ren2_2
{
	  /*����	�FRen2_2
	  �ÓI�ϐ�	�Fstatic int kekka
	  �ݽ�ݽ�ϐ��F�Ȃ�
	  ҿ��ޖ�	�Fr2_2
	  �����T�v	�F����p1�ƈ���p2�̉��Z���ʂ�ÓI�ϐ�kekka�ɐݒ肷��B
	  ����		�Fp1:0����127�܂ł̐��l
	  			  p2:0����127�܂ł̐��l
	  �߂�l	�Fp1��p2�𑫂�����*/
	static int kekka;
	static void r2_2(byte p1,byte p2)
	{
		kekka = p1 + p2;
	}
}
