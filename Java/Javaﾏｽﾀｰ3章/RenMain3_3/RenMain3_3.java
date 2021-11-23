class RenMain3_3
{
	public static void main(String args[])
	{
		try
		{
			int kekka;
			byte p1 = Byte.parseByte(args[0]);
			char r = args[1].charAt(0);
			byte p2 = Byte.parseByte(args[2]);
			switch(r)
			{
				case '+':
					kekka = p1+p2;
					break;
				case '-':
					kekka = p1-p2;
					break;
				case 'x':
					kekka = p1*p2;
					break;
				case '/':
					kekka =	p1/p2;
					break;
				default:
					System.out.println("�v�Z�ł��܂���");
					return;
			}
			System.out.println(args[0]+args[1]+args[2]+"="+kekka);
		}
		catch(NumberFormatException e)
		{
			//��O�����������ꍇ
			System.out.println("���������������͂���Ă��܂���");
		}
		catch(ArithmeticException e)
		{
			//��O�����������ꍇ
			System.out.println("0�ŏ��Z���邱�Ƃ��ł��܂���");
		}			
	}
}


