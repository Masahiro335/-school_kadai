class Kadai4_4
{
	//Kadai4_4�׽�̲ݽ�ݽ�ϐ���錾
	String name;		//����
	int age;			//�N��
	char seibetsu;		//����
	void k4_4(String p1)
	{
		name = p1;		//������ݒ�
	}
	void k4_4(String p1,int p2)
	{
		name = p1;		//������ݒ�
		age = p2;		//�N���ݒ�
	}
	void k4_4(String p1,int p2,char p3)
	{
		name = p1;		//������ݒ�
		age = p2;		//�N���ݒ�
		seibetsu = p3;	//���ʂ�ݒ�
	}
}

class Sample4_4
{
	public static void main(String args[])
	{
		int p2;
		char p3;
		//���ް�ނ�����͂��ꂽ�l��1����3��ނ��ް��ł���Έȉ��̏������s��
		if(args.length>0 && args.length<4)
		{
			Kadai4_4 c	= new Kadai4_4();		//Kadai4_4�׽�̲ݽ�ݽ�𐶐�����
			System.out.println("��������");
			switch(args.length)
			{
				case 1:		//���O�̂�
					c.k4_4(args[0]);					//K4_4ҿ��ނ����s����
					System.out.println("����:"+c.name);	//�������ި���ڲ�ɕ\������
					break;
				case 2:		//���O�ƔN��̂�
					p2 = Integer.parseInt(args[1]);
					c.k4_4(args[0],p2);					//Kadai4_4�׽�̺ݽ�׸������s
					System.out.println("����:"+c.name);	//�������ި���ڲ�ɕ\������
					System.out.println("�N��:"+c.age);	//�N����ި���ڲ�ɕ\������
					break;
				default: 	//���O�A�N��A����
					p2 = Integer.parseInt(args[1]);
					p3 = args[2].charAt(0);
					c.k4_4(args[0],p2,p3);
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


