import java.io.*;
class RenMain6_2
{
	public static void main(String args[])
	{
		//Ren6_2�׽�̲ݽ�ݽ�𐶐����ARen6_2�׽�̲ݽ�ݽ�ϐ�fName��̧�ٖ���ݒ肷��
		Ren6_2 c = new Ren6_2(args[0]);
		if(args.length==2)
		{
			//���ް�ނ���̧�ٖ����ް������͂��ꂽ��Ren6_2�׽��r6_2_1ҿ��ނ����s����
			boolean kekka = c.r6_2_1(args[1]);
			if(kekka==true)
			{
				System.out.println("�ް��̏������݂��I�����܂���");
			}
			else
			{
				System.out.println("�������ݴװ���������܂���");
			}
		}
		else
		{
			boolean kekka = c.r6_2_2();
			if(kekka==true)
			{
				System.out.println("----"+args[0]+"���ް�");
				System.out.println(c.rData);
			}
			else
			{
				System.out.println("�ǂݍ��ݴװ���������܂���");
			}
		}
	}
}


class Ren6_2
{
	String fName;
	char rData[] = new char[128];
	Ren6_2(String filename)
	{
		fName = filename;
	}
	boolean r6_2_1(String data)
	{
		try
		{
			FileWriter fw = new FileWriter(fName,true);
			fw.write(data);
			fw.close();
			return true;
		}
		catch(IOException d)
		{
			return false;
		}
	}
	boolean r6_2_2()
	{
		try
		{
			FileReader fr = new FileReader(fName);
			fr.read(rData);
			fr.close();
			return true;
		}
		catch(IOException d)
		{
			return false;
		}
	}
}



