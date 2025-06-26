public class ComparePerformance {
    public static void main(String[] args) {
        int loop = 100000;
        // 1 trieu lan may lag luon :)) nen chi de 100000
//        Thoi gian thuc hien voi String: 3556ms
//        Thoi gian thuc hien voi StringBuilder: 4ms
//        Thoi gian thuc hien voi StringBuffer: 3ms
        String string = "Hello";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            string = string.concat("World");
        }
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;
        System.out.println("Thoi gian thuc hien voi String: " + time1 + "ms");

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            stringBuilder.append("World");
        }
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;
        System.out.println("Thoi gian thuc hien voi StringBuilder: " + time2 + "ms");

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            stringBuffer.append("World");
        }
        long end3 = System.currentTimeMillis();
        long time3 = end3 - start3;
        System.out.println("Thoi gian thuc hien voi StringBuffer: " + time3 + "ms");
    }
}
