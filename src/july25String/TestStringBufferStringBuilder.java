package july25String;

public class TestStringBufferStringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuffer s1 = new StringBuffer("piyali");
        for (int i = 0; i < 10000; i++) {
            s1.append("saha");
        }
        System.out.println("time taken by stringBuffer " + (System.currentTimeMillis() - startTime) + "ms");

         startTime = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder("piyali");

        for (int i = 0; i < 10000; i++) {
            s2.append("saha");
        }
        System.out.println("time taken by stringBuilder " + (System.currentTimeMillis() - startTime) + "ms");

    }
}



