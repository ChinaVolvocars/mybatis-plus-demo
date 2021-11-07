package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.domain.SysLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Color
* @description 针对表【sys_log(系统日志表)】的数据库操作Service
* @createDate 2021-11-06 22:23:27
*/
public interface SysLogService extends IService<SysLog> {

  IPage<SysLog> queryPageByType(Integer pageNum, Integer pageSize, Integer logType);
}
