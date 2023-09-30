package org.example;


import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("5", "0", "yasuda", "suzuki", "a", "d", "?", "%", "[", "{");
        List<String> result = names.stream().sorted().toList();
        List<String> result2 = names.stream().map(name -> name.toUpperCase()).toList();
        List<String> result3 = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println("ソート結果" + result);
        System.out.println("ソート結果" + result2);

    }


}