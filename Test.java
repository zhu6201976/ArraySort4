/**
ֱ�Ӳ��������㷨
���Ӻ���ǰ�ҵ�����λ�ú���룩
����˼�룺ÿ����һ��������ļ�¼������˳�����С���뵽ǰ���Ѿ�����������еĺ���λ�ã��Ӻ���ǰ�ҵ�
����λ�ú󣩣�ֱ��ȫ������������Ϊֹ��
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		// ��ѭ����������
		for(int i=1;i<numbers.length;i++){
			int temp = numbers[i];// ���������
			int j = 0;
			for(j=i-1;j>=0;j--){
				if(numbers[j]>temp){
					numbers[j+1]=numbers[j];
				}else{
					break;
				}
			}
			if(numbers[i]!=temp){
				numbers[j+1] = temp;
			}
		}
		
		// ��ӡ���
		System.out.println("��С��������"+Arrays.toString(numbers));
	
	}
	
}

/**
34 4 56 17 90 65

��һ�֣�i=1��temp=4��	34 34 56 17 90 65 
						4  34 56 17 90 65
�ڶ��֣�i=2��temp=56��	4  34 56 17 90 65
�����֣�i=3��temp=17��	4  34 56 56 90 65
						4  34 34 56 90 65
						4  17 34 56 90 65
�����֣�i=4��temp=90��  4  17 34 56 90 65
�����֣�i=5��temp=65��  4  17 34 56 90 90
						4  17 34 56 65 90
*/

