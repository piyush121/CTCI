package Ch_1;

public class one_4 {
	
	public static void main(String[] args) {
		int j=16;
		int i=16;
		char[] str={'m','r',' ','j','o','h','n',' ','s','m','i','t','h',' ',' ',' ',' '};
		for(;i>=0;i--)
			if(str[i]==' ')
				continue;
			else break;
		for(;i>=0;i--)
			if(str[i]==' ')
				{
					str[j]='0';
					str[j-1]='2';
					str[j-2]='%';
					j=j-3;
				}
			else
				{
					str[j]=str[i];
					j--;
				}
			for(char ch : str)
		System.out.print(ch);
			
		
	}

}
