package Sort;

/**
  冒泡排序
  时间复杂度 平均o(n^2) 最好o(n) 最坏o(n^2)
  空间复杂度 o(1)
  稳定排序
**/
public class BubbleSort {
	public static void BubbleSort(Integer []data){
		int temp=0;
		for(int i=data.length-1;i>0;i--)
			for(int j=0;j<i;j++)
				if(data[j]>data[j+1]){
					temp=data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}	
	}

	public static void main(String[] args) {
        	Integer[] c = {4, 9, 23, 1, 45, 27, 5, 2 };
        	BubbleSort(c);
        	Stream.of(c).skip(1).forEach(System.out::println);
    	}

}
