class RenMain3_5
{
	public static void main(String args[])
	{
		char i=args[0].charAt(0);	//���ް�ނ�����͂��ꂽ������char�^�ɕϊ�
		Ren3_5 c=new Ren3_5();
		if(c.r3_5(i)==true)
		{
			System.out.println("�������ʂ�"+c.kekka+"�ł�");
		}
		else
		{
			System.out.println("�ϊ��ł��܂���");
		}
	}	
}

class Ren3_5
{
	char kekka; //�ݽ�ݽ�ϐ�
	boolean r3_5(char i)
	{
		if(Character.isLetter(i)==true) //i�������̏ꍇ
		{
			if(Character.isUpperCase(i)==true)		//i���啶���̏ꍇ
			{
				kekka = Character.toLowerCase(i);	//i���������ɂ���
				return(true);
			}
			else if(Character.isLowerCase(i)==true)	//i���������̏ꍇ
			{
				kekka = Character.toUpperCase(i);	//i��啶���ɂ���
				return(true);
			}
		}
				return(false);
	}	
}
