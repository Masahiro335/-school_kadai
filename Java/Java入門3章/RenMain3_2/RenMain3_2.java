class RenMain3_2
{
	static String kekka;	
	public static void main(String args[])
	{
		Ren3_2 c=new Ren3_2();
		c.r3_2(args[0]);
		System.out.println("�������ʂ�"+kekka+"�ł�");
	}
}

class Ren3_2
{
	void r3_2(String s)
	{
		//����s�̓��e��啶���ɕϊ����ÓI�ϐ�kekka�ɐݒ�
		RenMain3_2.kekka = s.toUpperCase();
	}
}

