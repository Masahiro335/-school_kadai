class Sample3_5
{
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);	//���ް�ނ�����͂��ꂽ�l��int�^�ɕϊ�����
		Kadai3_5 c = new Kadai3_5();		//Kadai3_5�׽�̲ݽ�ݽ�𐶐�����
		String kekka = c.k3_5(i);			//k3_5ҿ��ނ����s����
		System.out.println("��������"+kekka+"�ł�");
	}
}


class Kadai3_5
{
	String k3_5(int i)
	{
		Integer j = new Integer(i);		//Integer�׽�̲ݽ�ݽ�𐶐�����
		return j.toString();			//Integer�׽��String�׽�ɕϊ�����
	}
}

