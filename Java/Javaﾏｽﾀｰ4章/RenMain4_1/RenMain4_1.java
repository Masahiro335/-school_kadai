import java.util.*;
class Ren4_1
{
	Date r4_1(int day)
	{
		Date d = new Date();	
		long m = d.getTime();	//�������̌o�ߎ���(���ݎ���)���擾����
		long n = day*24*60*60;	//day����̔N�������v�Z����
		n *= 1000;				//�l���ؕb�Ȃ̂ōŌ��1000���|����
		m+=n;					//���ݎ�����day����̎����𑫂�
		d.setTime(m);			//�������X�V����
		return(d);
	}
}

class RenMain4_1
{
	public static void main(String args[])
	{
		int day = Integer.parseInt(args[0]);
		Calendar cal = Calendar.getInstance();
		Ren4_1 c = new Ren4_1();
		cal.setTime(c.r4_1(day));
		System.out.println(day+"����̔N�����F"+cal.get(Calendar.YEAR)+"�N"+(cal.get(Calendar.MONTH)+1)+"��"
							+cal.get(Calendar.DATE)+"��");
	}
}



