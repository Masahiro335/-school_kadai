class Kadai4_1
{
	String name;	//����
	int age;		//�N��
	char seibetsu;	//����
	//Kadai4_1�׽�̺ݽ�׸�
	Kadai4_1(String p1,int p2,char p3)
	{
		name = p1;		//������������
		age = p2;		//�N���������
		seibetsu = p3;	//���ʂ�������
	}
}

class Sample4_1
{
	public static void main(String args[])
	{
		int p2 = Integer.parseInt(args[1]);
		char p3 = args[2].charAt(0);
		Kadai4_1 c = new Kadai4_1(args[0],p2,p3);	//Kadai4_1�׽�̺ݽ�׸������s����
		System.out.println("��������");				//Kadai4_1�׽�̲ݽ�ݽ�ϐ��̒l���ި���ڲ�ɕ\������
		System.out.println("����:"+c.name);
		System.out.println("�N��:"+c.age);
		System.out.println("����:"+c.seibetsu);
	}
}

