package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.SysLog;
import com.example.demo.mapper.SysLogMapper;
import com.example.demo.service.SysLogService;
import org.springframework.stereotype.Service;

/**
* @author Color
* @description 针对表【sys_log(系统日志表)】的数据库操作Service实现
* @createDate 2021-11-06 22:23:27
*/
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService{


  @Override
  public IPage<SysLog> queryPageByType(Integer pageNum, Integer pageSize, Integer logType) {
    Page<SysLog> page = new Page<>(pageNum, pageSize);
    QueryWrapper<SysLog> queryWrapper=new QueryWrapper<>();
    queryWrapper.like("log_type",logType);
    return this.page(page,queryWrapper);
  }
}




