class Sample2_3{
	/*ҿ��ޖ�	�Fmain
	  �����T�v	�F1����100�܂ł̐��̉��Z�l���v�Z����Kadai2_3�׽��K2_3ҿ��ނ����s��
	  			  Sample2_3�׽�̐ÓI�ϐ�total�̒l���ި���ڲ�ɕ\������
	  ����		�F���ް�ނ�����͂��ꂽ�l
	  �߂�l	�F�Ȃ�*/
	static int total;	//1����100�܂ł̐��̉��Z�l���i�[����ÓI�ϐ���錾����
	public static void main(String args[])
	{
		Kadai2_3.k2_3();	//Kadai2_3�׽��k2_3ҿ��ނ����s����
		//�ϐ�total�̒l���ި���ڲ�ɕ\������
		System.out.println("1����100�̐ώZ�l��"+total+"�ł�");
	}
}	

class Kadai2_3{
	/*ҿ��ޖ�	�Fk2_3
	  �����T�v	�F1����100�܂ł̐��̉��Z�l��Sample2_3�׽�ɐ錾����Ă���
				  �ÓI�ϐ�total�ɐݒ肷��
	  ����		�F�Ȃ�
	  �߂�l	�F�Ȃ�
	  ���l		�F�{ҿ��ނ͐ÓIҿ��ނƂ���B*/
	static void k2_3()
	{
		for(int i=1; i<101; i++)
		{
			Sample2_3.total+=i;		//1����100�܂ł̉��Z���ʂ�total�ɐݒ肷��
		}
	}
}	
