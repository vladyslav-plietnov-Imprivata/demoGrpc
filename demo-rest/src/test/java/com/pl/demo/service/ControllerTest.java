package com.pl.demo.service;

import static com.pl.demo.TestUtils.asJsonString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.pl.demo.dto.HelloDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

public class ControllerTest {

  private MockMvc mvc;
  @Mock
  private HelloService helloService;

  @BeforeEach
  public void setUp() {
    initMocks(this);
    mvc = standaloneSetup(new Controller(helloService)).build();
  }

  @Test
  public void get_whenGreetingIsPresent_shouldReturnGreeting() throws Exception {
    when(helloService.get(1))
        .thenReturn(HelloDto.builder().value("hello").build());

    MvcResult result = mvc.perform(get("/base/1"))
        .andExpect(status().isOk())
        .andReturn();

    assertEquals(result.getResponse().getContentAsString(), "hello");
  }

  @Test
  public void get_whenGreetingIfAbsent_shouldReturnError() throws Exception {
    when(helloService.get(1)).thenReturn(null);

    MvcResult result = mvc.perform(get("/base/1"))
        .andExpect(status().isNotFound())
        .andReturn();

    assertEquals(result.getResponse().getContentAsString(), "");
  }

  @Test
  public void delete_whenDeleted_shouldReturnOkStatus() throws Exception {
    mvc.perform(delete("/base/1"))
        .andExpect(status().isOk())
        .andReturn();

    verify(helloService).delete(1);
  }

  @Test
  public void update_whenGreetingIsPresent_returnUpdatedValue() throws Exception {
    HelloDto helloDto = HelloDto.builder().id(1).value("hello").build();

    when(helloService.updateGreeting(1, "hello")).thenReturn(helloDto);

    String content = asJsonString(HelloDto.builder().id(1).value("hello").build());
    MvcResult result =
        mvc.perform(put("/base")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
            .andExpect(status().isOk())
            .andReturn();

    assertEquals(content, result.getResponse().getContentAsString());
  }

  @Test
  public void getAll_whenGreetingIsAbsent_shouldReturnError() throws Exception {
    HelloDto helloDto = HelloDto.builder().id(1).value("hello").build();

    when(helloService.getAll()).thenReturn(List.of(helloDto));

    MvcResult result = mvc.perform(get("/base/1")).andExpect(status().isNotFound()).andReturn();

    assertEquals(result.getResponse().getContentAsString(), "");
  }
}
