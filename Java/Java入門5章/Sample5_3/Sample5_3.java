class Kadai5_3_1
{
	int code;
	//Kadai5_3_1�׽�̺ݽ�׸�
	Kadai5_3_1(int p1)
	{
		code = p1;
	}
}

class Kadai5_3_2 extends Kadai5_3_1
{
	String name;
	//Kadai5_3_2�׽�̺ݽ�׸�
	Kadai5_3_2(int p1,String p2)
	{
		super(p1);		//Kadai5_3_1�׽�̺ݽ�׸������s����
		name = p2;
	}
}

class Kadai5_3_3 extends Kadai5_3_2
{
	byte age;
	//Kadai5_3_3�׽�̺ݽ�׸�
	Kadai5_3_3(int p1,String p2,byte p3)
	{
		super(p1,p2);		//Kadai5_3_2�׽�̺ݽ�׸������s����
		age = p3;
	}
}

class Sample5_3
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		byte p3 = Byte.parseByte(args[2]);
		Kadai5_3_3 c = new Kadai5_3_3(p1,args[1],p3);
		System.out.println("��������");
		System.out.println("�ԍ�:"+c.code);
		System.out.println("���O:"+c.name);
		System.out.println("�N��:"+c.age);
	}
}

