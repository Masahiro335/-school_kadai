class Sample3_1
{
	//ҿ��ޖ�	�Fmain
	//������	�FKadai3_1�׽��K3_1ҿ��ނ����s���A�߂�l���ި���ڲ�ɕ\������
	//����		�F���ް�ނ�����͂��ꂽ������
	//�߂�l	�F�Ȃ�
	public static void main(String args[])
	{
		Kadai3_1 c = new Kadai3_1();	//Kadai3_1�׽�̲ݽ�ݽ�𐶐�����
		int kekka = c.k3_1(args[0]);	//k3_1ҿ��ނ����s����
		//k3_1ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("���ް�ނ�����͂��ꂽ��������"+kekka+"�����ł�");
	}
}


class Kadai3_1
{
	//ҿ���		:k3_1
	//�����T�v	:����moji�̕�������߂�l�ɐݒ肷��
	//����		:moji=������
	//�߂�l	:����moji�̕�����
	int k3_1(String moji)
	{
		return moji.length();	//�����Ŏw�肳�ꂽString��޼ު�Ă̕�������
								//�߂�l�ɐݒ肷��
	}
}

