class RenMain2_3
{
	static int kekka;
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//���ް�ނ�����͂��ꂽ�l��byte�^�ɕϊ�����
		byte j = Byte.parseByte(args[1]);
		Ren2_3.r2_3(i,j);					//Ren2_3�׽��r2_3ҿ��ނ����s���Akekka�̒l���ި���ڲ�ɕ\������
		System.out.println(i+"+"+j+"="+kekka);
	}
}

class Ren2_3
{
	  /*����	�FRen2_3
	  �ÓI�ϐ�	�F�Ȃ�
	  �ݽ�ݽ�ϐ��F�Ȃ�
	  ҿ��ޖ�	�Fr2_3
	  �����T�v	�F����p1�ƈ���p2�̉��Z���ʂ�RenMain2_3�׽�̐ÓI�ϐ�kekka�ɐݒ肷��B
	  ����		�Fp1:0����127�܂ł̐��l
	  			  p2:0����127�܂ł̐��l
	  �߂�l	�F�Ȃ�*/
	static void r2_3(byte p1,byte p2)
	{
		RenMain2_3.kekka = p1 + p2;
	}
}
