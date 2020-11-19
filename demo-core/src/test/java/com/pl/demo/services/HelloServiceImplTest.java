package com.pl.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.entity.HelloEntity;
import com.pl.demo.mapper.Mapper;
import com.pl.demo.repository.HelloRepository;
import com.pl.demo.service.HelloService;
import com.pl.demo.service.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;
import java.util.Optional;

public class HelloServiceImplTest {

    private HelloService helloService;

    @Mock
    private HelloRepository helloRepository;
    private Mapper mapper = new Mapper();

    @BeforeEach
    public void setUp() {
        initMocks(this);
        helloService = new HelloServiceImpl(helloRepository, mapper);
    }

    @Test
    public void createGreeting_shouldCreateHelloEntity() {
        when(helloRepository.save(HelloEntity.builder().value("hello").build()))
            .thenReturn(HelloEntity.builder().id(1).value("hello").build());

        HelloDto hello = helloService.createGreeting("hello");

        assertEquals(HelloDto.builder().id(1).value("hello").build(), hello);
    }

    @Test
    public void updateGreeting_shouldUpdateExistingEntity() {
        HelloEntity stubbing = HelloEntity.builder().id(1).value("hello").build();

        when(helloRepository.findById(1)).thenReturn(Optional.ofNullable(stubbing));
        when(helloRepository.save(HelloEntity.builder().id(1).value("hello2").build()))
            .thenReturn(HelloEntity.builder().id(1).value("hello2").build());

        HelloDto hello = helloService.updateGreeting(1, "hello2");

        assertEquals(HelloDto.builder().id(1).value("hello2").build(), hello);
    }

    @Test
    public void get_shouldReturnEntityById() {
        HelloEntity stubbing = HelloEntity.builder().id(1).value("hello").build();

        when(helloRepository.findById(1)).thenReturn(Optional.ofNullable(stubbing));

        HelloDto helloDto = helloService.get(1);

        assertEquals(HelloDto.builder().id(1).value("hello").build(), helloDto);
    }

    @Test
    public void getAll_shouldReturnAllEntity() {
        HelloEntity stubbing = HelloEntity.builder().id(1).value("hello").build();

        when(helloRepository.findAll()).thenReturn(List.of(stubbing));

        List<HelloDto> helloDto = helloService.getAll();

        assertEquals(List.of(HelloDto.builder().id(1).value("hello").build()), helloDto);
    }
}
