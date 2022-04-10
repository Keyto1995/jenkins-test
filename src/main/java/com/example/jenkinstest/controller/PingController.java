package com.example.jenkinstest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RestController
@RequestMapping("/api/rest")
public class PingController {

  private final AtomicInteger pingCounter = new AtomicInteger();

  @GetMapping("/ping")
  public String ping() {
    log.debug("[GET] /api/rest/ping");
    return "Pong[" + pingCounter.incrementAndGet();
  }
}
