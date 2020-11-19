package com.pl.demo.service;

import com.pl.demo.dto.HelloDto;

import java.util.List;

public interface ServiceBase {

    HelloDto getGreeting(int id);

    HelloDto createGreeting(String greeting);

    HelloDto updateGreeting(int id, String greeting);

    void deleteGreeting(int id);

    List<HelloDto> getAllGreetings();
}
