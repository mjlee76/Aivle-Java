package com.chap08;

class GenericClass<T> {
    private T data;        // T 타입의 데이터를 저장하는 변수

    public void setData(T data) {  // 메서드: T 타입의 데이터를 설정
        this.data = data;
    }

    public T getData() {  // 메서드: T 타입의 데이터를 반환
        return data;
    }
}