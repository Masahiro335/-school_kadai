class Sample3_3
{
	//ҿ��ޖ�	�Fmain
	//������	�FKadai3_3�׽��K3_3ҿ��ނ����s���A�߂�l���ި���ڲ�ɕ\������
	//����		�F���ް�ނ�����͂��ꂽ������
	//�߂�l	�F�Ȃ�
	public static void main(String args[])
	{
		Kadai3_3 c = new Kadai3_3();	//Kadai3_3�׽�̲ݽ�ݽ�𐶐�����
		String kekka = c.k3_3(args[0]);	//k3_3ҿ��ނ����s����
		//k3_3ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("�������ʂ�"+kekka+"�ł�");
	}
}


class Kadai3_3
{
	//ҿ���		:k3_3
	//�����T�v	:����moji�̕����𔽓]�����AString��޼ު�Ăɂ��ĕԂ�
	//����		:moji=String��޼ު��
	//�߂�l	:����moji�𔽓]������String��޼ު��
	String k3_3(String moji)
	{
		StringBuffer sb = new StringBuffer(moji);
		sb = sb.reverse();		//������𔽓]������
		return sb.toString();	//���]�������������߂�l�ɐݒ肷��
	}
}

