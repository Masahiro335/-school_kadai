class Sample2_5
{
	/*ҿ��ޖ�	�Fmain
	  �����T�v	�F1����100�܂ł̐��̉��Z�l���v�Z����Kadai2_5�׽��K2_5ҿ��ނ����s���A
	  			  Kadai2_5�׽�̲ݽ�ݽ�ϐ�total�̒l���ި���ڲ�ɕ\������
	  ����		�F���ް�ނ�����͂��ꂽ�l
	  �߂�l	�F�Ȃ�*/
	public static void main(String args[])
	{
		Kadai2_5 c=new Kadai2_5();	//Kadai2_5�׽�̲ݽ�ݽ�𐶐�����
		c.k2_5();					
		System.out.println("1����100�̐ώZ�l��"+c.total+"�ł�");
	}
}	

class Kadai2_5
{
	/*ҿ��ޖ�	�Fk2_5
	  �����T�v	�F1����100�܂ł̐��̉��Z�l���v�Z���A�ϐ�total�ɐݒ肷��
	  ����		�F�Ȃ�
	  �߂�l	�F�Ȃ�
	  ���l		�F�{ҿ��ނͲݽ�ݽҿ��ނƂ���B*/
	int total;		//1����100�܂ł̐��̉��Z�l���i�[����ݽ�ݽ�ϐ���錾����
	void k2_5()
	{
		for(int i=1; i<101; i++)
		{
			total+=i;		//1����100�܂ł̉��Z���ʂ����߂�
		}
	}
}	

