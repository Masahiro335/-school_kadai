class Sample2_4{
	/*ҿ��ޖ�	�Fmain
	  �����T�v	�F1����100�܂ł̐��̉��Z�l���v�Z����Kadai2_4�׽��
	  			  �ݽ�ݽҿ���K2_4ҿ��ނ����s���A�߂�l���ި���ڲ�ɕ\������
	  			  Sample2_4�׽�̐ÓI�ϐ�total�̒l���ި���ڲ�ɕ\������
	  ����		�F���ް�ނ�����͂��ꂽ�l
	  �߂�l	�F�Ȃ�*/
	public static void main(String args[])
	{
		Kadai2_4 c=new Kadai2_4();	//Kadai2_4�׽�̲ݽ�ݽ�𐶐�����
		int kekka = c.k2_4();			//Kadai2_4�׽��k2_4ҿ��ނ����s����
		//K2_4ҿ��ނ̎��s���ʂ��ި���ڲ�ɕ\������
		System.out.println("1����100�̐ώZ�l��"+kekka+"�ł�");
	}
}	

class Kadai2_4{
	/*ҿ��ޖ�	�Fk2_4
	  �����T�v	�F1����100�܂ł̐��̉��Z�l���v�Z���A�߂�l�ɐݒ肷��
	  ����		�F�Ȃ�
	  �߂�l	�F1����100�܂ł̐��̉��Z����
	  ���l		�F�{ҿ��ނͲݽ�ݽҿ��ނƂ���B*/
	int k2_4()
	{
		int i,total=0;
		for(i=1; i<101; i++)
		{
			total+=i;		//1����100�܂ł̉��Z���ʂ����߂�
		}
		return total;
	}
}	
