package com.xiaol.springcloud.service;

import com.xiaol.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAl1();
}
