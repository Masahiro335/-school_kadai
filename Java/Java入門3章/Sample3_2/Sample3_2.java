class Sample3_2
{

	public static void main(String args[])
	{
		Kadai3_2 c = new Kadai3_2();	//Kadai3_2�׽�̲ݽ�ݽ�𐶐�����
		String kekka = c.k3_2(args[0]);	//k3_2ҿ��ނ����s����
		//k3_2ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("���ް�ނ�����͂��ꂽ��������"+kekka+"�ł�");
	}
}


class Kadai3_2
{

	String k3_2(String moji)
	{
		return moji.toLowerCase();	//�����Ŏw�肳�ꂽString��޼ު�Ă̕�������
									//�߂�l�ɐݒ肷��
	}
}

