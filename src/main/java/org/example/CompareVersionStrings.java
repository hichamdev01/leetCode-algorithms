package org.example;

import java.util.Arrays;
import java.util.List;

public class CompareVersionStrings {
    public static void main(String[] args) {
        System.out.println(compareVersion("2.10" , "1.12"));
    }

    public static int compareVersion(String version1, String version2) {
        List<Integer> v1Segments = getSegmentsForVersion(version1);
        List<Integer> v2Segments = getSegmentsForVersion(version2);
        int sizeV1 = v1Segments.size();
        int sizeV2 = v2Segments.size();
        int maxSize = Math.max(sizeV1 , sizeV2);
        for (int i = 0 ; i < maxSize ; i++){
            int num1 = (i < sizeV1) ? v1Segments.get(i) : 0;
            int num2 = (i < sizeV2) ? v2Segments.get(i) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }

    private static List<Integer> getSegmentsForVersion(String version){
        return  Arrays.stream(version.split("\\."))
                .map(Integer::parseInt)
                .toList();
    }
}