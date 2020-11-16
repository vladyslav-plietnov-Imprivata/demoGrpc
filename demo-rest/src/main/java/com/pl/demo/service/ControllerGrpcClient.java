package com.pl.demo.service;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.dto.CreateGreetingRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/base/grpc")
public class ControllerGrpcClient {

  private final ServiceBaseImpl helloService;

  public ControllerGrpcClient(ServiceBaseImpl helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<String> get(
      @PathVariable("id") int id
  ) {
    return ResponseEntity.ok(helloService.getGreeting(id).getValue());
  }

  @PostMapping
  public ResponseEntity<HelloDto> create(
      @RequestBody CreateGreetingRequest request
  ) {
    HelloDto result = helloService.createGreeting(request.getGreeting());
    return ResponseEntity.status(HttpStatus.CREATED).body(result);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> delete(
      @PathVariable("id") int id
  ) {
    helloService.deleteGreeting(id);
    return ResponseEntity.ok().build();
  }

  @PutMapping
  public ResponseEntity<Object> update(
      @RequestBody
          HelloDto helloDto) {
    HelloDto dto = helloService.updateGreeting(helloDto.getId(), helloDto.getValue());
    return ResponseEntity.ok(dto);
  }

  @GetMapping
  public ResponseEntity<Object> getAll() {
    List<HelloDto> helloDto = helloService.getAllGreetings();
    return ResponseEntity.ok(helloDto);
  }
}
