/**
直接插入排序算法
（从后向前找到合适位置后插入）
基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的子序列的合适位置（从后向前找到
合适位置后），直到全部插入排序完为止。
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		// 外循环控制轮数
		for(int i=1;i<numbers.length;i++){
			int temp = numbers[i];// 保存操作数
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
		
		// 打印结果
		System.out.println("从小到大排序："+Arrays.toString(numbers));
	
	}
	
}

/**
34 4 56 17 90 65

第一轮，i=1，temp=4，	34 34 56 17 90 65 
						4  34 56 17 90 65
第二轮，i=2，temp=56，	4  34 56 17 90 65
第三轮，i=3，temp=17，	4  34 56 56 90 65
						4  34 34 56 90 65
						4  17 34 56 90 65
第四轮，i=4，temp=90，  4  17 34 56 90 65
第五轮，i=5，temp=65，  4  17 34 56 90 90
						4  17 34 56 65 90
*/

