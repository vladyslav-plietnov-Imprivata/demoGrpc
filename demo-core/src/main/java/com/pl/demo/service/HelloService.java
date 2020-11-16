package com.pl.demo.service;

import com.pl.demo.dto.HelloDto;

import java.util.List;

public interface HelloService {

  HelloDto createGreeting(String greeting);

  HelloDto updateGreeting(int id, String greeting);

  void delete(int id);

  HelloDto get(int id);

  List<HelloDto> getAll();
}
