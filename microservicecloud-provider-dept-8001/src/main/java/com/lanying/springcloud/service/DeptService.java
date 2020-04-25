package com.lanying.springcloud.service;

import com.lanying.springcloud.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
