class Sample3_4
{
	//ҿ��ޖ�	�Fmain
	//������	�FKadai3_4�׽��K3_4ҿ��ނ����s���A�߂�l���ި���ڲ�ɕ\������
	//����		�F���ް�ނ�����͂��ꂽ���l
	//�߂�l	�F�Ȃ�
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);	//���ް�ނ�����͂��ꂽ�l��int�^�ɕϊ�����
		Kadai3_4 c = new Kadai3_4();		//Kadai3_4�׽�̲ݽ�ݽ�𐶐�����
		String kekka = c.k3_4(i);			//k3_4ҿ��ނ����s����
		System.out.println(i+"��16�i�ɕϊ������"+kekka+"�ł�");
	}
}


class Kadai3_4
{
	//ҿ���		:k3_4
	//�����T�v	:����i��16�i�ɕϊ����AString��޼ު�Ăɂ��Ė߂�l�ɐݒ肷��
	//����		:i=int�^�̐��l
	//�߂�l	:����i��16�i�ɕϊ�����String��޼ު��
	String k3_4(int i)
	{
		return Integer.toHexString(i);	//�����Ŏw�肳�ꂽ�l��16�i�ɕϊ�����
	}
}

