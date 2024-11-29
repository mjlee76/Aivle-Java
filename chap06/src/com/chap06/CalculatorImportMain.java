package com.chap06;

import com.chap06.sub01.Calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculatorImportMain {
    public static void main(String[] args) {
        // BigDecimal 리스트를 생성하고 값들을 추가
        List<BigDecimal> nums = new ArrayList<>();
        nums.add(new BigDecimal("10.5"));
        nums.add(new BigDecimal("20.75"));
        nums.add(new BigDecimal("30"));

        // Calculator 인스턴스를 생성하고 sum 메서드를 호출
        Calculator calc = new Calculator();
        double result = calc.sum(nums);

        // 결과를 출력
        System.out.println("총합은 " + result + "입니다.");
    }
}
