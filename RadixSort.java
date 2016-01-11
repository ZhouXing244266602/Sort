package Sort;
public class RadixSort {
	/**
	 * ��������ӵ�λ����λ���У�ʹ�����һ�μ���������ɺ���������
	          ��ԭ�����ڶ��ڴ���������ݣ�����Ȩ��δ֪������£�
	          �Ȱ�Ȩ��С����������Ȼ��Ȩ�ش����������
	          ����Ƚ�ʱ�䣬�Ȱ��������ٰ���������������򣬽����������Ρ�
	          ��������������λ��û��ô���ˡ�
	 * @param number
	 * @param d
	 */
	public static void RadixSort(int []number,int d){  //d��ʾ�������ж���λ
		int k=0; //���������
		int n=1; //Ȩ��1��ʾ��λ 10��ʾʮλ 100��ʾ��λ
		int m=1; //���Ƽ�ֵ������������һλ
		int [][]temp=new int[10][number.length];  //����ĵ�һά��ʾ���ܵ�����0-9
		int []order=new int[10];  //����order[i]������ʾ��λ��i�����ĸ���
		while(m<=d){   //��ÿ���ؼ���Ȩ�ر���
			for(int i=0;i<number.length;i++){
				int lsd=((number[i]/n)%10);  //��������ڸ�Ȩ���ϵ�ֵ
				temp[lsd][order[lsd]]=number[i];  //���ݸ�Ȩֵ�ϵ�ֵlsd����number������temp[lsd][order[lsd]],��ʾ����Ϊlsd���������¼�ĵ�lsd����number[i]
				order[lsd]++; //����Ϊlsd�ĸ�����1			
			}
			for(int i=0;i<10;i++){
				if(order[i]!=0){   //�������ȨֵΪi����
					for(int j=0;j<order[i];j++)
						number[k++]=temp[i][j];   //��Ȩֵ��Ϊi������ȫ��ȡ������number[k]��,��number�ǰ���ĳ��Ȩֵ���е�����					
				}
				order[i]=0;  //Ȩֵ������������0
			}		
			n*=10;  //Ȩֵλ�����1��
			k=0;    //�����������0
			m++;    //����λ��+1
		}	
	}
	
	public static void main(String[] args){
        int[]data ={73, 22, 93, 43, 55, 14, 28, 65, 39, 81, 33,100,231,900};
        RadixSort.RadixSort(data,3);
        for(int i = 0;i < data.length; i++)
            System.out.print(data[i] +" ");
	}
}
