class RenMain3_1
{
	public static void main(String args[])
	{
		try
		{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		Ren3_1 c = new Ren3_1();
		c.r3_1(p1,p2);
		}
		catch(NumberFormatException e)
		{
			//��O�����������ꍇ
			System.out.println("��������͂��Ă�������");
		}	
	}
}

class Ren3_1
{
	int data[] = new int[10];
	void r3_1(int p1,int p2)
	{
		try
		{
			data[p1] = p2;
			System.out.println("����I��");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//��O�����������ꍇ
			System.out.println("�z��̗v�f�ԍ����͈͂𒴂��Ă��܂�");
		}			
	}
}
