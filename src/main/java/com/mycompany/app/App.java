package com.mycompany.app;

import com.mycompany.app.dto.ExampleDto;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var exampleDto = ExampleDto.fromIdentifier("test");
        System.out.println(exampleDto);
    }
}
