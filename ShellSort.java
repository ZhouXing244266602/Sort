package Sort;

/**
 希尔排序
 时间复杂度 平均o(n^1.3) 最好o(n) 最坏o(n^2)
 空间复杂度 o(1)
 不稳定排序
 **/
public class ShellSort {
	
    public static void shellInsert(Comparable[] array, Integer dk) {
        for (int i = dk; i < array.length; i++) {
            if (array[i].compareTo(array[i - dk]) < 0) {
                Comparable tmp = array[i];
                int j = i - dk;
                for (; j >= 0 && tmp.compareTo(array[j]) < 0; j = j - dk) {
                    array[j + dk] = array[j];
                }
                array[j + dk] = tmp;
            }
        }
    }

    public static void sellSort(Comparable[] data, Integer[] dltas) {
        for (Integer dlta : dltas) {
            shellInsert(data, dlta);
        }
    }

    public static void main(String[] args) {
        Integer[] data = new Integer[] {0, 32, 4, 3, 6, 2, 1, 9, 5, 8, 7, 22, 11};
        Integer[] dlta = new Integer[] {3, 2, 1};
        sellSort(data, dlta);
        Stream.of(data).forEach(System.out::println);
    }

}
