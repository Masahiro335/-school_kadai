class Sample3_1
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		Kadai3_1 c = new Kadai3_1();
		c.k3_1(p1,p2);
	}
}

class Kadai3_1
{
	int data[] = new int[10];
	void k3_1(int p1,int p2)
	{
		try
		{
			data[p1] = p2;	//data��p1�Ԗڂ�p2�̒l��ݒ肷��
			System.out.println("����I��");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�z��̗v�f�ԍ����͈͂𒴂��Ă��܂�");
		}
	}
}
