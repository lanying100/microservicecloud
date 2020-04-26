package com.lanying.springcloud.controller;

import com.lanying.springcloud.entity.Dept;
import com.lanying.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

// 前后端分离，后端返回给前端的不是jsp，而是JSON字符串
@RestController //  @Controller + @ResponseBody
public class DeptController {

    @Autowired
    private DeptService deptService;

    // @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){ // @RequestBody将请求体中的参数装配成实体类对象，前提是key和属性名称一致
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){ // 获取URL中的参数
        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
