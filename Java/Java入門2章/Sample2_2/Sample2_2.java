class Sample2_2{
	/*ҿ��ޖ�	�Fmain
	  �����T�v�@�FKadai2_2�׽��k2_2ҿ��ނ����s���A
	 			  Kadai2_2�׽�̐ÓI�ϐ�total�̒l���ި���ڲ�ɕ\������
	  ����		�F���ް�ނ�����͂��ꂽ�l
	  �߂�l	�F�Ȃ�
	  ���l		�F1����100�܂ł̐��̉��Z�l��Kadai2_2�׽�̐ÓI�ϐ�total�Ɋi�[�����B*/
	public static void main(String args[])
	{
		Kadai2_2.k2_2();	//Kadai2_2�׽��k2_2ҿ��ނ����s����
		//k2_2ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("1����100�̐ώZ�l��"+Kadai2_2.total+"�ł�");
	}
}	

class Kadai2_2{
	//ҿ��ޖ�	�Fk2_2
	//�����T�v�@�F1����100�܂ł̐��̉��Z�l���v�Z���A�ÓI�ϐ�total�ɐݒ肷��
	//����		�F�Ȃ�
	//�߂�l	�F�Ȃ�
	//���l		�F�{ҿ��ނ͐ÓIҿ��ނƂ���B
	//1����100�܂ł̐��̉��Z�l���i�[����ÓI�ϐ���錾����
	static int total;
	static void k2_2()
	{
		for(int i=1; i<101; i++)	//���Z�l���i�[����ϐ�
		{
			total+=i;				//1����100�܂ł̉��Z���ʂ�total�ɐݒ肷��
		}
	}
}	
