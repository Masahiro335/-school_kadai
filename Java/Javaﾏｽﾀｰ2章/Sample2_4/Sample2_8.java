class Sample2_8
{
	public static void main(String args[])
	{
		System.out.println("GC1");
		GC1g = new GC1();				//GC1�׽�̵�޼ު�Ă𐶐�����
		System.out.println("GC2");
		g = null;						//GC1�׽�̵�޼ު�Ă�null����
		System.out.println("GC3");
		System.gc();					//�ް�ޯ�޺ڸ��݂̎��s���{��
		System.out.println("GC4");
	}
}

class GC1
{
	public void finalize()		//GC1�׽��finalizeҿ���
	{
		System.out.println("--finaliza--")
	}
}







