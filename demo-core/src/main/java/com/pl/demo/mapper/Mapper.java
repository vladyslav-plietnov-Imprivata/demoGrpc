package com.pl.demo.mapper;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.entity.HelloEntity;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

  public HelloEntity toHelloWorldEntity(String greeting) {
    return HelloEntity.builder()
        .value(greeting)
        .build();
  }

  public HelloDto toHelloDto(HelloEntity entity){
    return HelloDto.builder()
        .id(entity.getId())
        .value(entity.getValue())
        .build();
  }
}
