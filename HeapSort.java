package Sort;

/**
 堆排序
 时间复杂度 平均 o(nlogn) 最好 o(nlogn) 最坏 o(nlogn)
 空间复杂度 o(1)
 不稳定
 **/
public class HeapSort {
	
    /**
     * 大顶堆调整
     */
    public static void headAdjust(Integer data[], int adjustIndex, int lastIndex) {
        // 除s外均满足堆，调整s成大顶堆
        int adjustData = data[adjustIndex];
        // 遍历adjustIndex中的所有孩子进行对调整
        for (int i = 2 * adjustIndex + 1; i <= lastIndex; i = i * 2 + 1) {
            // 选择孩子中较大的一个
            if (i < lastIndex && data[i] < data[i + 1]) {
                i++;
            }
            // 要调整的值大于当前孩子的值，则中断遍历，将调整值插入当前孩子的父亲节点
            if (adjustData > data[i]) {
                break;
            }
            // 如果调整的值小于当前孩子，那么将当前孩子的数值上移
            data[adjustIndex] = data[i];
            adjustIndex = i;
        }
        data[adjustIndex] = adjustData;
    }

    public static void heapSort(Integer[] data) {
        // 创建初始大顶堆,保证所有的父结点都比它的孩子结点数值大
        for (int i = data.length / 2; i >= 0; i--) {
            headAdjust(data, i, data.length - 1);
        }
        for (int i = data.length - 1; i > 0; i--) {
            // 将最后一个节点交换到堆顶开始调整
            int tmp = data[i];
            data[i] = data[0];
            data[0] = tmp;
            // 每次都是从堆顶调整起。将参与堆排序的总数减少1,可让刚被换的堆顶不参与排序
            headAdjust(data, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        Integer[] c = {29, 4, 9, 23, 1, 45, 27, 5, 2};
        heapSort(c);
        Stream.of(c).forEach(System.out::println);
    }
	
}
