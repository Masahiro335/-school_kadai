class RenMain3_4
{
	public static void main(String args[])
	{
		Ren3_4 c=new Ren3_4();
		int i = Integer.parseInt(args[0]);
		byte kekka = c.r3_4(i);
		System.out.println(i+"��byte�^�ɕϊ������"+kekka+"�ł�");
	}
}

class Ren3_4
{
	//����p1�̒l��byte�^�ɕϊ����A�߂�l�ɐݒ肷��
	byte r3_4(int p1)
	{
		Integer j = new Integer(p1); //Integer�׽�̲ݽ�ݽ�𐶐�����
		return j.byteValue();		 //Integer�׽��byte�׽�ɕϊ�
	}
}

