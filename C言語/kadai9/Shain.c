
#include<stdio.h>
#include<Shain.h>
#include<WINDOWS.H>

char i,j,kekka;


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

/*����(F_Name)�Ŏw�肳�ꂽ�t�@�C���́A����(Record)�Ŏw�肳�ꂽ�ʒu�A
����(ShainInfo)�Ŏw�肳�ꂽ1�����̎Ј�����������*/
char WINAPI Dll_FileWrite(char F_Name[],void *ShainInfo,unsigned short W_Size,char Record)
{
	FILE *fp;
	/*̧�ق�����Ӱ�ނŵ���݂���*/
	if(fopen_s(&fp,F_Name,"rb+")!=0)
	{
		/*����Ӱ�ނŵ���݂ł��Ȃ���ΐV�KӰ�ނŵ���݂���*/
		if(fopen_s(&fp,F_Name,"wb")!=0)
		{
			return(NG);	/*�V�KӰ�ނł൰��݂ł��Ȃ���΁A�������ʂ�NG�Ƃ���*/
		}
	}
	/*̧�ق̏����݈ʒu���ړ�����*/
	if(fseek(fp,W_Size*Record,SEEK_SET)!=0)
	{
		fclose(fp);	/*̧���߲�����ړ��ł��Ȃ���Ώ������ʂ�NG�Ƃ���*/
		return(NG);
	}
	/*̧�ق�1�l���̎Ј��ް�����������*/
	if(fwrite(ShainInfo,sizeof(char),W_Size,fp)!=W_Size)
	{
		fclose(fp);	/*�������ݴװ�Ȃ珈�����ʂ�NG�Ƃ���*/
		return(NG);
	}
 		/*̧�ق�۰�ނ���*/
		fclose(fp);
		/*�������ʂ�OK�Ƃ���*/
		return(OK);	
}

//�����Ŏw�肳�ꂽ�����ɊY������S�Ă̎Ј������A����(ShainData)�ɐݒ肷��
char WINAPI Dll_Find_2(char Option1,char Option2,char *Option3[],char MaxShain,SHAIN_DATA ShainData[])
{
	char Count=0;

	for(i=0; i<MaxShain; i++)
	{
		switch(Option1)	
		{
			case 1:	//����
				if(ShainData[i].Seibetsu==Option2)	
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
			case 2:	//����
				if(ShainData[i].Section==Option2)	
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
			case 3:	//�s���{��
				kekka = strncmp(&ShainData[i].Address[12],*Option3,6);
				if(kekka==0)
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
		}
	}
	if(Count==0)
	{
		return(0);
	}
		return(Count);	//�Y������Ј���
}


/*����(ShainData)�Ŏw�肳�ꂽ�Ј�����׸�����(�e�L�X�g�`��)�ɕϊ����A
�@����(F_Name)�Ŏw�肳�ꂽ�t�@�C���ɏ�����*/
char WINAPI Dll_TextChange(char F_Name[],char MaxShain,SHAIN_DATA ShainData[])
{
	SHAIN_CHAR Temp[MAX_SHAIN];
	/*�ȉ��̏������Ј������AShainData���ް���׸��ϊ�*/
	for(i=0; i<MaxShain; i++)
	{
		sprintf_s(Temp[i].Id,sizeof(Temp[i].Id),"%3d",ShainData[i].Id);
		memcpy(&Temp[i].Name[0],&ShainData[i].Name[0],MAX_NAME);
		sprintf_s(Temp[i].Age,sizeof(Temp[i].Age),"%2d",ShainData[i].Age);
		sprintf_s(Temp[i].Year,sizeof(Temp[i].Year),"%4d",ShainData[i].Year);
		sprintf_s(Temp[i].Month,sizeof(Temp[i].Month),"%2d",ShainData[i].Month);
		sprintf_s(Temp[i].Day,sizeof(Temp[i].Day),"%2d",ShainData[i].Day);
		memcpy(&Temp[i].Address[0],&ShainData[i].Address[0],MAX_ADDR);	
		if(ShainData[i].Seibetsu==MAN)
		{
			strcpy_s(Temp[i].Seibetsu,sizeof(Temp[i].Seibetsu),"�j��");
		}
		else
		{
			strcpy_s(Temp[i].Seibetsu,sizeof(Temp[i].Seibetsu),"����");
		}
		switch (ShainData[i].Section)
    	{
			case EMPLOYER:
			strcpy_s(Temp[i].Section,sizeof(Temp[i].Section),"�����");
			break;

			case GEBERAL:
			strcpy_s(Temp[i].Section,sizeof(Temp[i].Section),"������");
			break;

			case SALES:
			strcpy_s(Temp[i].Section,sizeof(Temp[i].Section),"�c�ƕ�");
			break;
		}
	}

	/*�ȉ��̏������Ј������A�J��Ԃ��s�Ȃ�*/
	for(i=0; i<MaxShain; i++)
	{
		 /*Temp�̎Ј��ް���1�l���AKadai23.Dat�ɏ�����*/
		 kekka = Dll_FileWrite(F_Name,&Temp[i],sizeof(SHAIN_CHAR),i);
		 if(kekka==NG)
		 {
			 /*FileWrite�֐��̏������ʂ�NG�Ȃ�߂�l��NG��ݒ肷��*/
			 return(NG);
		 }
	}
		return(OK);
}
