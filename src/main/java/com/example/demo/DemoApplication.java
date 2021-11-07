package com.example.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.domain.SysLog;
import com.example.demo.service.SysLogService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

  @Autowired
  SysLogService service;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @PostMapping("/index")
  public IPage<SysLog> index(@RequestParam(value = "pageNum") int pageNum,
                             @RequestParam(value = "pageSize") int pageSize,
                             @RequestParam(value = "logType") int logType) {
    IPage<SysLog> page = service.queryPageByType(pageNum, pageSize, logType);
    System.out.println(page.toString());
    return page;
  }

  @PostMapping("/log")
  public IPage<SysLog> log(@RequestBody LogBody body) {
    IPage<SysLog> page = service.queryPageByType(body.getPageNum(), body.getPageSize(), body.getLogType());
    System.out.println(page.toString());
    return page;
  }

}
