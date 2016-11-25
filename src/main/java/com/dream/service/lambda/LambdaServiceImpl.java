package com.dream.service.lambda;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("lambdaLambdaServiceImpl")
public class LambdaServiceImpl {

    /**
     * 测试001
     */
    public void collectorsJoining() {
        List<Integer> numList = Stream.of(Arrays.asList(1, 3, 2), Arrays.asList(6, 9, 3))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        numList.stream().forEach(System.out::println);
        List<String> strList = Arrays.asList("a", "b", "c");
        String numStr = strList.parallelStream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(numStr);

        strList = numList.stream().map(num -> String.valueOf(num)).collect(Collectors.toList());

        numStr = strList.parallelStream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(numStr);
    }

    /**
     * 测试002
     */
    public void minMax() {
        List<Integer> numList = Stream.of(Arrays.asList(1, 3, 2), Arrays.asList(6, 9, 3))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        numList.stream().forEach(System.out::println);

        Integer maxNum = numList.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(" max num: " + maxNum);
        Integer minNum = numList.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(" min num: " + minNum);
    }

    /**
     * 测试003
     */
    public void reduceTest() {
        int count = Stream.of(1, 3, 888, 2, 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(" the sum: " + count);
    }

    /**
     * 测试004
     */
    public void intStatistics() {
        List<Integer> numList = Arrays.asList(1, 3, 5, 3);
        IntSummaryStatistics summaryStatistics = numList.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
                summaryStatistics.getMax(),
                summaryStatistics.getMin(),
                summaryStatistics.getAverage(),
                summaryStatistics.getSum());
    }



}
