//�{�׽��super�׽�Ƃ���
class Kadai5_1_1
{
	int code;
}

//�{�׽��Kadai5_1_1�׽�̻�޸׽�Ƃ���
class Kadai5_1_2 extends Kadai5_1_1
{
	String name;
}

//�{�׽��Kadai5_1_2�׽�̻�޸׽�Ƃ���
class Kadai5_1_3 extends Kadai5_1_2
{
	byte age;
}

class Sample5_1
{
	public static void main(String args[])
	{
		if(args.length>0 && args.length<4)
		{
			Kadai5_1_3 c = new Kadai5_1_3();
			System.out.println("��������");
			switch(args.length)
			{
				case 1:		//�ԍ��̂�
					//�ԍ���int�^�ɕϊ����AKadai5_1_3�׽�̲ݽ�ݽ�ϐ�code�ɐݒ肷��
					c.code = Integer.parseInt(args[0]);
					//Kadai5_1_3�׽�̲ݽ�ݽ�ϐ��̒l���ި���ڲ�ɕ\������
					System.out.println("�ԍ�:"+c.code);
					break;
				case 2:		//�ԍ��Ǝ����̂�
					//�ԍ���int�^�ɕϊ����AKadai5_1_3�׽�̲ݽ�ݽ�ϐ�code�ɐݒ肷��
					c.code = Integer.parseInt(args[0]);
					//������Kadai5_1_3�׽�̲ݽ�ݽ�ϐ�name�ɐݒ肷��
					c.name = args[1];
					//Kadai5_1_3�׽�̲ݽ�ݽ�ϐ��̒l���ި���ڲ�ɕ\������
					System.out.println("�ԍ�:"+c.code);
					System.out.println("����:"+c.name);
					break;
				case 3:		//�ԍ��A�����A�N��
					//�ԍ���int�^�ɕϊ����AKadai5_1_3�׽�̲ݽ�ݽ�ϐ�code�ɐݒ肷��
					c.code = Integer.parseInt(args[0]);
					//������Kadai5_1_3�׽�̲ݽ�ݽ�ϐ�name�ɐݒ肷��
					c.name = args[1];
					//�N���byte�^�ɕϊ����AKadai5_1_3�׽�̲ݽ�ݽ�ϐ�age�ɕύX����
					c.age = Byte.parseByte(args[2]);
					//Kadai5_1_3�׽�̲ݽ�ݽ�ϐ��̒l���ި���ڲ�ɕ\������
					System.out.println("�ԍ�:"+c.code);
					System.out.println("����:"+c.name);
					System.out.println("�N��:"+c.age);
			}
		}
	}
}

