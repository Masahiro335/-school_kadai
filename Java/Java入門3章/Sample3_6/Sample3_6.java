class Sample3_6
{
	public static void main(String args[])
	{
		char i=args[0].charAt(0);	//���ް�ނ�����͂��ꂽ������char�^�ɕϊ�
		Kadai3_6 c=new Kadai3_6();	//Kadai3_6�׽�̲ݽ�ݽ�𐶐�����
		String kekka = c.k3_6(i);	//k3_6ҿ��ނ����s���A���ʂ��ި���ڲ�ɕ\������
		System.out.println("���͂��ꂽ������"+kekka);
	}	
}

class Kadai3_6
{
	String k3_6(char i)
	{
		if(Character.isLetterOrDigit(i)==true)
		{
			if(Character.isDigit(i)==true)
			{
				return "�����ł��B";
			}
			if(Character.isLetter(i)==true)
			{
				if(Character.isUpperCase(i)==true)
				{
					return "�啶���ł��B";
				}
				if(Character.isLowerCase(i)==true)
				{
					return "�������ł��B";
				}
			}
		}
		if(Character.isSpaceChar(i)==true)
		{
			return "�X�y�[�X�ł��B";
		}
		return "�L�����S�p�����ł��B";
	}
}
