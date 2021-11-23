
#include<stdio.h>
#include<Shain.h>
#include<WINDOWS.H>

char i,j;


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

//�����Ŏw�肳�ꂽ�����ɊY������Ј��̕��ϔN���߂�l�ɐݒ肷��B
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
	
//�����Ŏw�肳�ꂽ�����ɊY������Ј��̎Ј��ԍ���߂�l�ɐݒ肷��		
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

//�����Ŏw�肳�ꂽ�Ј����(ShainInfo)���Ј�����ɒǉ�
char WINAPI Dll_Insert(char *MaxShain,SHAIN_DATA *ShainInfo,SHAIN_DATA ShainData[])
{
	for(i=0; i<*MaxShain; i++)
	{
		if(ShainInfo->Id < ShainData[i].Id)
		{
			//�ǉ������Ј�����Id���ɕ��ѕς���
			memcpy(&ShainData[i+1],&ShainData[i],sizeof(SHAIN_DATA)*(*MaxShain-i));
			break;
		}
		else if(ShainInfo->Id == ShainData[i].Id)
		{
			//�Ј����ƎЈ������ID�������̏ꍇ�A�Ј�����ɏ㏑��
			ShainData[i] = *ShainInfo;
			return(i);
		}
		
	}
	ShainData[i] = *ShainInfo;	//�Ј�����Id��ǉ�
	*MaxShain = *MaxShain + 1;
	return(i+1);
}

//�����Ŏw�肳�ꂽ�Ј������Ј����납��폜����
char WINAPI Dll_Delete(char *MaxShain,short Id,SHAIN_DATA ShainData[])
{
	for(i=0; i<*MaxShain; i++)
	{
		//�Ј�����ƈ���Id�������ꍇ
		if(Id == ShainData[i].Id)
		{
			//����Id�̎Ј�������폜
			memset(&ShainData[i],0,sizeof(SHAIN_DATA)*1);
			//����Id�̎��̔ԍ��̎Ј������Id�̔ԍ��ɃR�s�[
		    memcpy(&ShainData[i],&ShainData[i+1],sizeof(SHAIN_DATA)*(*MaxShain-i));
			*MaxShain=*MaxShain-1;
		    return(OK);
		}	
	}
		return(NG);
}


//�����Ŏw�肳�ꂽ�����ɂ���ĎЈ����̕��ёւ����s�Ȃ��B
void WINAPI Dll_Sort(char Req,char MaxShain,char Option,SHAIN_DATA ShainData[])
{
	SHAIN_DATA temp;
  	SHAIN_DATA Temp[MAX_SHAIN];
    char x = 0;
	char y = 0;
	
	switch(Req)
	{
		case 1:	//�N�
			if(Option==0)	//�~��
			{
				for(j=MaxShain-1; j>0; j--)
				{
					for(i=0; i<j; i++)
					{
						if(ShainData[i].Age < ShainData[i+1].Age)
						{
							temp = ShainData[i];
							ShainData[i] = ShainData[i+1];
							ShainData[i+1] = temp;
						}
					}
				}
			}
		    else if(Option==1)	//����
			{
				for(j=MaxShain-1; j>0; j--)
				{
					for(i=0; i<j; i++)
					{
						if(ShainData[i].Age > ShainData[i+1].Age)
						{
							temp = ShainData[i];
							ShainData[i] = ShainData[i+1];
							ShainData[i+1] = temp;
						}
					}
				}
			}
			break;
		case 2:	//���ʏ�
			for(i=0; i<MaxShain; i++)
			{
				/*Option�̐��ʂ���v����*/
				if(ShainData[i].Seibetsu == Option)
				{
					ShainData[x] = ShainData[i];
					x = x + 1;
				}
				else if(ShainData[i].Seibetsu != Option)
				{
					Temp[y] = ShainData[i];
					y++;
				}
			}	
			if(y != 0)
			{	
				memcpy(&ShainData[x],&Temp[0],sizeof(SHAIN_DATA)*y);
			}
			break;
		case 3:	//�������ޏ�
			for(j=MaxShain-1; j>0; j--)
			{
				for(i=0; i<j; i++)
				{
					if(ShainData[i].Section > ShainData[i+1].Section)
					{
						temp = ShainData[i];
						ShainData[i] = ShainData[i+1];
						ShainData[i+1] = temp;
					}
				}
			}
			break;
		case 4:	//�Ј��ԍ���(����)
			for(j=MaxShain-1; j>0; j--)
			{
				for(i=0; i<j; i++)
				{
					if(ShainData[i].Id > ShainData[i+1].Id)
					{
						temp = ShainData[i];
						ShainData[i] = ShainData[i+1];
						ShainData[i+1] = temp;
					}
				}
			}
			break;					
	}
}