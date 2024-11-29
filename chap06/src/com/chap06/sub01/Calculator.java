package com.chap06.sub01;

import java.math.BigDecimal;
import java.util.List;

// 계산기능을 제공하는 메서드
public class Calculator {
    // 합계를 계산하는 메서드
    public double sum(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.ZERO; // 합계를 저장할 변수를 초기화
        for(BigDecimal num : numbers) {
            sum = sum.add(num);
        }
        return  sum.doubleValue(); // double 타입으로 변환하여 반환
    }
}
