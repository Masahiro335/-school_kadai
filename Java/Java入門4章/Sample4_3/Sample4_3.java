class Kadai4_3
{
	String name;	//����
	int age;		//�N��
	char seibetsu;	//����
	//Kadai4_3�׽�̺ݽ�׸�
	Kadai4_3(String n)
	{
		name = n;	//������������
	}
	Kadai4_3(String p1,int p2)
	{
		name = p1;		//������������
		age = p2;		//�N���������
	}
	Kadai4_3(String p1,int p2,char p3)
	{
		name = p1;		//������������
		age = p2;		//�N���������
		seibetsu = p3;	//���ʂ�������
	}
}

class Sample4_3
{
	public static void main(String args[])
	{
		int p2;
		char p3;
		//���ް�ނ�����͂��ꂽ�l��1����3��ނ��ް��ł���Έȉ��̏������s��
		if(args.length>0 && args.length<4)
		{
			Kadai4_3 c;		//Kadai4_3�׽�̕ϐ���p�ӂ���
			System.out.println("��������");
			switch(args.length)
			{
				case 1:		//���O�̂�
					c = new Kadai4_3(args[0]);			//Kadai4_3�׽�̺ݽ�׸������s
					System.out.println("����:"+c.name);	//�������ި���ڲ�ɕ\������
					break;
				case 2:		//���O�ƔN��̂�
					p2 = Integer.parseInt(args[1]);
					c = new Kadai4_3(args[0],p2);		//Kadai4_3�׽�̺ݽ�׸������s
					System.out.println("����:"+c.name);	//�������ި���ڲ�ɕ\������
					System.out.println("�N��:"+c.age);	//�N����ި���ڲ�ɕ\������
					break;
				default: 	//���O�A�N��A����
					p2 = Integer.parseInt(args[1]);
					p3 = args[2].charAt(0);
					c = new Kadai4_3(args[0],p2,p3);
					System.out.println("����:"+c.name);	//�������ި���ڲ�ɕ\������
					System.out.println("�N��:"+c.age);	//�N����ި���ڲ�ɕ\������
					System.out.println("����:"+c.seibetsu);	//���ʂ��ި���ڲ�ɕ\������
					break;
			}
		}
		//���ް�ނ��牽�����͂���Ă��Ȃ����A4��ވȏ���ް�����͂��ꂽ�ꍇ
		else
		{
			System.out.println("�ݒ�l�����͂���Ă��܂���");
		}
	}
}


