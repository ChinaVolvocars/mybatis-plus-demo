package com.example.demo;

import com.example.demo.domain.SysLog;
import com.example.demo.mapper.SysLogMapper;
import com.github.pagehelper.Page;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void page(){
    Page<SysLog> sysLogs = new Page<SysLog>(1, 10);
  }

}
