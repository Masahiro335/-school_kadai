import java.io.*;
class RenMain6_1
{
	public static void main(String args[])
	{
		File file = new File(args[0]);
		if(file.exists()==true)
		{
			if(file.isFile()==true)
			{
				System.out.println(file+"��̧�قł�");
			}
			if(file.isDirectory()==true)
			{
				System.out.println(file+"���ިڸ�؂ł�");
			}
		}
		else
		{
			System.out.println(file+"�͑��݂��܂���");
		}
	}
}


