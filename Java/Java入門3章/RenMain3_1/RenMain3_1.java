class RenMain3_1
{
	public static void main(String args[])
	{
		Ren3_1 c=new Ren3_1();
		int kekka = c.r3_1(args[0],args[1]);
		if(kekka !=-1)
		{
			//�����񂪌��������ꍇ�͕����ʒu��\������
			System.out.println(args[1]+"��"+kekka+"�����ڂɑ��݂��܂�");
		}
		else
		{
			//�����񂪌�����Ȃ������ꍇ
			System.out.println(args[1]+"�͑��݂��܂���B");
		}
	}
}

class Ren3_1
{
	int r3_1(String p1,String p2)
	{
		int a=0;
		a = p1.indexOf(p2);	//p1�̕����񂩂當����p2��T��
		return (a);
	}
}

