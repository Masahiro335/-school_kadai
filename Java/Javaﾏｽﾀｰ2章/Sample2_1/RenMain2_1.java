class RenMain2_1
{
	public static void main(String args[])
	{
		Ren2_1 c = new Ren2_1();
		c.r2_1();
	}
}

class Ren2_1
{
	static int data[] = {1,2,3,4,5,6,7,8,9,10};
	double kekka;
	void r2_1()
	{
		Ren2_1_1 c1 = new Ren2_1_1();
		kekka = c1.r2_1_1();
		System.out.println("���v�l��"+kekka+"�ł�");
		System.out.println("���ϒl��"+kekka/10+"�ł�");
	}
	//���ް�׽�ɕύX
	class Ren2_1_1
	{
		double r2_1_1()
		{
			double t = 0;
			//Ren2_1�׽�̔z��data�̍��v�����߂�
			for(int i=0; i<10; i++)
			{
				t+=data[i];
			}
			return t;
		}
	}
}
