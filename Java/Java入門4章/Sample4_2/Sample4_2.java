class Kadai4_2
{
	String name;	//����
	int age;		//�N��
	char seibetsu;	//����
	//Kadai4_2�׽�̺ݽ�׸�
	Kadai4_2(String n)
	{
		name = n;	//������������
	}
	void k4_2(int p1,char p2)
	{
		age = p1;		//�N���ݒ肷��
		seibetsu = p2;	//���ʂ�ݒ肷��
	}
}

class Sample4_2
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[1]);
		char p2 = args[2].charAt(0);
		Kadai4_2 c = new Kadai4_2(args[0]);		//Kadai4_2�׽�̺ݽ�׸������s
		c.k4_2(p1,p2);							//Kadai4_2�׽��k4_2ҿ��ނ����s
		System.out.println("��������");			//Kadai4_2�׽�̲ݽ�ݽ�ϐ��̒l���ި���ڲ�ɕ\��
		System.out.println("����:"+c.name);
		System.out.println("�N��:"+c.age);
		System.out.println("����:"+c.seibetsu);
	}
}


