package Sort;

public class HeapSort {
	
	public static void HeapAdjust(Integer data[], int s, int m) {
		// ��s�������ѣ�����s�ɴ󶥶�
		int rc = data[s], j; // rc�ݴ�s
		for (j = 2 * s; j < m; j *= 2) { // ��s�ĺ������ҵ�s�ò����λ��
			if (j < m && data[j] < data[j + 1]) // ѡ�����нϴ���Ǹ�
				j++;
			if (data[j] < rc) // �������С����s,��ô˵���ڴ󶥶���sӦ�����λ��
				break;
			else { // ������Ӵ���s,��ô���������Ƶ�˫�׽�㣨s��¼����ε�j,Ҳ������һ�����ӵ�˫�ף�
				data[s] = data[j];
				s = j;
			}
		}
		data[s] = rc; // rc>=data[j],rc��j���ϣ����j��˫��Ӧ��Ϊrc
	}

	public static void HeapSort(Integer data[]) {
		int size = data.length - 1, temp;
		// ������ʼ�󶥶�,�Է��ն˶�������
		for (int i = size / 2; i >= 0; i--) {
			HeapAdjust(data, i, size);
		}
		// ��n-1����¼�ĶѲ���ɸѡ(���һ������ɸѡ)
		for (int i = size; i >= 1; --i) {
			// �����������һ��Ԫ�ػ���
			temp = data[i];
			data[i] = data[0];
			data[0] = temp;
			// ��������������������1,���øձ����ĶѶ�����������
			HeapAdjust(data, 0, i - 1);
		}
	}

	public static void main(String[] args) {
		Integer[] c = { 4, 9, 23, 1, 45, 27, 5, 2 };
		HeapSort(c);
		for (int i = 0; i < c.length; i++)
			System.out.println("������" + c[i]);
	}
}
