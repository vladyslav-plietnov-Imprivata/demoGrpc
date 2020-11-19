package com.pl.demo.service;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.entity.HelloEntity;
import com.pl.demo.mapper.Mapper;
import com.pl.demo.repository.HelloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;
    private final Mapper mapper;

    public HelloServiceImpl(HelloRepository helloRepository, Mapper mapper) {
        this.helloRepository = helloRepository;
        this.mapper = mapper;
    }

    public HelloDto createGreeting(String greeting) {
        HelloEntity entity = mapper.toHelloWorldEntity(greeting);
        HelloEntity saveResult = helloRepository.save(entity);
        return mapper.toHelloDto(saveResult);
    }

    public HelloDto updateGreeting(int id, String greeting) {
        Optional<HelloEntity> entity = helloRepository.findById(id);
        if (entity.isPresent()) {
            entity.get().setValue(greeting);
            return mapper.toHelloDto(helloRepository.save(entity.get()));
        } else {
            return createGreeting(greeting);
        }
    }

    public void delete(int id) {
        helloRepository.deleteById(id);
    }

    public HelloDto get(int id) {
        HelloEntity helloEntity =
            helloRepository.findById(id).orElseGet(() -> HelloEntity.builder().build());
        return mapper.toHelloDto(helloEntity);
    }

    @Override
    public List<HelloDto> getAll() {
        return StreamSupport.stream(helloRepository.findAll().spliterator(), false)
            .map(mapper::toHelloDto)
            .collect(Collectors.toList());
    }
}
