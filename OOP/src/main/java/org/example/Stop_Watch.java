package org.example;

public class Stop_Watch {
    public class Search {
        public static int MAX = 100;
        public static int MIN = 10;
        public static int[] createArray(int size) {
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = (int)(Math.random()*(MAX - MIN +1) + MIN);
            }
            return numbers;
        }
    }

    private long startTime;
    private long endTime;

    public Stop_Watch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        int size = 1000000;
        int[] numbers = Search.createArray(size);

        stopWatch.start();

        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers, 0, numbers.length-1); // 5682-> 5s

//        Search.selectionSort(numbers); // 978842s -> 16phut

        System.out.println("Finish..........");
        stopWatch.stop();
        System.out.println("selectionSort: " + stopWatch.getElapsedTime());
    }
}
