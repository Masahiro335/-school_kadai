
#include<stdio.h>
#include<Shain.h>
#include<WINDOWS.H>

char i;


char WINAPI Dll_FileRead(char F_Name[],void*ShainInfo,unsigned short R_Size,char Record)
{

		FILE *fp;
	/*̧�ق�����Ӱ�ނŵ���݂���*/
	if(fopen_s(&fp,F_Name,"rb+")!=0)
	{
			return(NG);/*�V�KӰ�ނł൰��݂ł��Ȃ���΁A�������ʂ�NG�Ƃ���*/
	}
	
	/*̧�ق̏����݈ʒu���ړ�����*/
	if(fseek(fp,R_Size*Record,SEEK_SET)!=0)
	{
		fclose(fp);		/*̧���߲�����ړ��ł��Ȃ���Ώ������ʂ�NG�Ƃ���*/
		return(NG);
	}
	
	/*̧�ق���1�l���ް���Ǎ���*/
	if(fread(ShainInfo,sizeof(char),R_Size,fp)!= R_Size)
	{
		/*�Ǎ��݂Ɏ��s������̧�ق̏I�[�������s��*/
		if(feof(fp)==0)
		{
			/*̧�ق̏I�[�łȂ���Ώ������ʂ�NG�Ƃ���*/
			fclose(fp);
			return(NG);
		}
			/*̧�ق̏I�[�Ȃ珈�����ʂ�EOF�Ƃ���*/
	     	fclose(fp);
	    	return(EOF); /*EOF��stdio.h ͯ�ް̧�قɒ�`����Ă���萔�ł�*/
	}
			/*̧�ق�۰�ނ���*/
	     	fclose(fp);
			return(OK);

}



float WINAPI Dll_Average(char Req,char *MaxShain,char Section,SHAIN_DATA ShainData[])
{
	float Average = 0;
	char Count=0;


	switch(Req)
	{
		case 1: //�S�Ј��̕��ϔN��
			for(i=0; i<*MaxShain; i++)
			{
				Average = Average + ShainData[i].Age;
				Count++;
			}
			break;	
			
		case 2: //�j���Ј��̕��ϔN��
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Seibetsu == MAN)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}		
			}
			break;
				
		case 3: //�����Ј��̕��ϔN��
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Seibetsu == WOMAN)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}		
			}
			break;

		case 4: //��������(Section)�ɊY������Ј��̕��ϔN��
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Section == Section)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}
			}
			break;		
			
		default :
			return(NG);			
	}
	if(Count==0)
	{
		return(NG);
	}
	Average = Average / Count;	//���ϔN��
	*MaxShain=Count;			//�Ј���
	return(Average);
}
	
	
	
short WINAPI Dll_Find(char Req,char MaxShain,SHAIN_DATA ShainData[])
{
		char a = 0;		
		
		switch(Req)
		{
			case 1: //�ō���̎Ј��ԍ�
				for(i=1; i<MaxShain; i++)
				{
					if(ShainData[i].Age > ShainData[a].Age)
					{
						a = i;
					}	
				}
				break;
				
			case 2: //�ŔN���̎Ј��ԍ�
				for(i=1; i<MaxShain; i++)
				{
					if(ShainData[i].Age < ShainData[a].Age)
					{
						a = i;
					}	
				}
				break;
			
			default:
				return(NG);	
		}
			return(ShainData[a].Id);
}
