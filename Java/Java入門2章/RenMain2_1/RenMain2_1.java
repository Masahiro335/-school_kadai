class RenMain2_1
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//���ް�ނ�����͂��ꂽ�l��byte�^�ɕϊ�����
		byte j = Byte.parseByte(args[1]);
		int kekka = Ren2_1.r2_1(i,j);		//Ren2_1�׽��r2_1ҿ��ނ����s����
											//r2_1ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println(i+"+"+j+"="+kekka);
	}	
}

class Ren2_1
{
	  /*����	�FRen2_1
	  �ÓI�ϐ�	�F�Ȃ�
	  �ݽ�ݽ�ϐ��F�Ȃ�
	  ҿ��ޖ�	�Fr2_1
	  �����T�v	�F����p1�ƈ���p2�̉��Z���ʂ�߂�l�ɐݒ肷��B
	  ����		�Fp1:0����127�܂ł̐��l
	  			  p2:0����127�܂ł̐��l
	  �߂�l	�Fp1��p2�𑫂�����*/
	  
	static int r2_1(byte p1,byte p2)
	{
		int total = 0;
		total = p1 + p2;
		return total;	//�������ʂ�߂�l�ɂ���
	}
}
