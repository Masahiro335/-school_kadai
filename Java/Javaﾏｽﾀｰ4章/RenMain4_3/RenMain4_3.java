import java.util.*;
class RenMain4_3
{
	static String name[] = {"��؈�Y","�c���[��","��㗲","�㓡�T�q","���c����"};
	
	public static void main(String args[])
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int i;
		for(i=0; i<name.length; i++)
		{
			hm.put(name[i],101+i);
		}
		
		if(args.length>0)
		{
			boolean kekka;
			String s = args[0];
			kekka = hm.containsKey(s);
			if(kekka == true)
			{
				System.out.println(s+"����̃R�[�h:"+hm.get(s));
			}
			else
			{
				System.out.println(s+"����͑��݂��܂���B");
			}
		}
		else
		{
			System.out.println("HashMap:"+hm);
		}
	}
}

