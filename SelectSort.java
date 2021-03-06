package Sort;

/**
 选择排序
 时间复杂度 平均o(n^2) 最好o(n^2) 最坏o(n^2)
 空间复杂度 o(1)
 不稳定排序
 **/
public class SelectSort {
	
    public static void selectSort(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] c = {4, 9, 23, 1, 45, 27, 5, 2};
        selectSort(c);
        Stream.of(c).forEach(System.out::println);
    }
	
}
