class Sample1_4
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		if(p1>0 && p1<5)	
		{
			boolean kekka1;		//���̪�����������Ă��邩�ۂ��̌��ʂ��i�[����
			String kekka2;		//ҿ��ނ̎��s���ʂ��i�[����ϐ�
			switch(p1)			//���ް�ނ�����͂��ꂽ�l�ɂ�菈���𕪊򂷂�
			{
				case 1:
					Kadai1_4_1 c1 = new Kadai1_4_1();
					kekka1 = c1 instanceof Interface1_4;	//Interface1_4�̎����������s��
					kekka2 = c1.r1_4();
					break;
				case 2:
					Kadai1_4_2 c2 = new Kadai1_4_2();
					kekka1 = c2 instanceof Interface1_4;	//Interface1_4�̎����������s��
					kekka2 = c2.r1_4();
					break;
				case 3:
					Kadai1_4_3 c3 = new Kadai1_4_3();
					kekka1 = c3 instanceof Interface1_4;	//Interface1_4�̎����������s��
					kekka2 = c3.r1_4();
					break;
				default:
					Kadai1_4_4 c4 = new Kadai1_4_4();
					kekka1 = c4 instanceof Interface1_4;	//Interface1_4�̎����������s��
					kekka2 = c4.r1_4();
			}
			if(kekka1==true)
			{
				//Interface1_4���������Ă�����ȉ���ү���ނ�\������
				System.out.println(kekka2+"��Interface1_4���������Ă��܂�");
			}
			else
			{
				//Interface1_4���������Ă��Ȃ���Έȉ���ү���ނ�\������
				System.out.println(kekka2+"��Interface1_4���������Ă��܂���");
			}
		}
		else	//���ް�ނ�����͂��ꂽ�l��1����3�ȊO�̏ꍇ
		{
			System.out.println("�Y�����镔����������܂���");
		}
	}
}

//Interface�̐錾
interface Interface1_4
{
	String r1_4();
}

//Kadai1_4_1�׽��Interface1_4���̧������������
class Kadai1_4_1 implements Interface1_4
{
	public String r1_4()
	{
		return "Kadai1_4_1�׽";
	}
}	

//Kadai1_4_2�׽��Kadai1_4���̪�����������Ȃ�
class Kadai1_4_2
{
	String r1_4()
	{
		return "Kadai1_4_2�׽";
	}
}

//Kadai1_4_3�׽��Kadai1_4_1�׽���p������
class Kadai1_4_3 extends Kadai1_4_1
{
	public String r1_4()
	{
		return "Kadai1_4_3�׽";
	}
}

//Kadai1_4_4�׽��Interface1_4_1���̪�����������Ȃ�
class Kadai1_4_4
{
	String r1_4()
	{
		return "Kadai1_4_4�׽";
	}
}

