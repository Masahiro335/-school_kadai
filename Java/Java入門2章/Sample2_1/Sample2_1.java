class Sample2_1{
	//ҿ��ޖ�	�Fmain
	//�����T�v�@�FKadai2_1�׽��k2_1ҿ��ނ����s���A�������ʂ��ި���ڲ�ɕ\������B
	//����		�F���ް�ނ�����͂��ꂽ�l
	//�߂�l	�F�Ȃ�
	//���l		�F�{ҿ��ނ�C�����main�֐��I�Ȗ�����S���B
	public static void main(String args[])
	{
		int kekka = Kadai2_1.k2_1();	//Kadai2_1�׽��k2_1ҿ��ނ����s����
		//k2_1ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("1����100�̐ώZ�l��"+kekka+"�ł�");
	}
}	

class Kadai2_1{
	//ҿ��ޖ�	�Fk2_1
	//�����T�v�@�F1����100�܂ł̐��̉��Z�l���v�Z���A�߂�l�ɐݒ肷��
	//����		�F�Ȃ�
	//�߂�l	�F1����100�܂ł̐��̉��Z����
	//���l		�F�{ҿ��ނ͐ÓIҿ��ނƂ���B
	static int k2_1()
	{
		int total=0;
		for(int i=1; i<101; i++)	//���Z�l���i�[����ϐ�
		{
			total+=i;				//1����100�܂ł̉��Z���ʂ�total�ɑ������
		}
		return total;				//�������ʂ�߂�l�ɂ���
	}
}	
