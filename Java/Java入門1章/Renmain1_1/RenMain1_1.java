class RenMain1_1
{
	public static void main(String args[])
	{
		int count = 0;
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		for(int i=x; i<=y; i++)
		{
			count = count + i;
		}
		//���ް�ނ�����͂��ꂽ���l�ƐώZ�l���ި���ڲ�ɕ\������
		System.out.println(x+"����"+y+"�܂ł̐ϐ��l��"+count+"�ł��B");
	}	
}	
	