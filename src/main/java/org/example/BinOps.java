package org.example;

public class BinOps {
    public String sum(String a, String b) {

        int stringA = Integer.parseInt(a, 2);
        int stringB = Integer.parseInt(b, 2);

        int sumOfBin = stringA + stringB;

        return Integer.toBinaryString(sumOfBin);
    }

    public String mult(String a, String b) {

        int stringA = Integer.parseInt(a, 2);
        int stringB = Integer.parseInt(b, 2);

        int multOfBin = stringA * stringB;

        return Integer.toBinaryString(multOfBin);
    }
}
