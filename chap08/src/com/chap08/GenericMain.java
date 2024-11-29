package com.chap08;

public class GenericMain {
    public static void main(String[] args) {
        // String 타입을 위한 GenericClass 인스턴스 생성
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕, 제네릭!");
        String data = stringInstance.getData();
        System.out.println(data);

        GenericClass<Integer> intInstance = new GenericClass<>();
        intInstance.setData(123);
        Integer intData = intInstance.getData(); // int intData = intInstance.getData(); 도 가능
        System.out.println(intData);

        GenericClass<Custom> customInstance = new GenericClass<>();
        customInstance.setData(new Custom());
        Custom c = customInstance.getData();
        System.out.println(c);

        // 번외: Object사용 : 아무 타입이나 가능
        GenericClass<Object> objInstance = new GenericClass<>();
        objInstance.setData(10);
        objInstance.setData("Hello");
        String a = (String) objInstance.getData(); // String타입으로 getData하려면 강제형변환 해야함
        System.out.println(a);
    }
}
