class Ren4_2
{
	byte code;			//�R�[�h
	String name;		//���i��
	int price;			//���i
	//Ren4_2�׽�̺ݽ�׸�
	void ren4_2(byte p1)
	{
		code = p1;		//���ނ�������
	}
	void ren4_2(byte p1,String p2)
	{
		code = p1;		//���ނ�������
		name = p2;		//���i����������
	}
	void ren4_2(byte p1,String p2,int p3)
	{
		code = p1;		//���ނ�������
		name = p2;		//���i����������
		price = p3;		//���i��������
	}
}

class RenMain4_2
{
	public static void main(String args[])
	{
		//���ް�ނ�����͂��ꂽ�l��1����3��ނ��ް��ł���Έȉ��̏������s��
		if(args.length>0 && args.length<4)
		{
			Ren4_2 c = new Ren4_2();
			byte p1 = Byte.parseByte(args[0]);		//���ނ�byte�^�ɕϊ�����
			System.out.println("��������");
			switch(args.length)
			{
				case 1:		//����
					c.ren4_2(p1);
					System.out.println("�R�[�h:"+c.code);
					break;
				case 2:		//���ނƏ��i��
					c.ren4_2(p1,args[1]);
					System.out.println("�R�[�h:"+c.code);
					System.out.println("���i��:"+c.name);
					break;
				default: 	//����,���i��,���i
					int p3 = Integer.parseInt(args[2]);
					c.ren4_2(p1,args[1],p3);
					System.out.println("�R�[�h:"+c.code);
					System.out.println("���i��:"+c.name);
					System.out.println("���i:"+c.price);
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


