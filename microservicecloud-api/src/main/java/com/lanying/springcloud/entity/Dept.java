package com.lanying.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true) // 允许链式调用
public class Dept implements Serializable {
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source; // 数据库地址

    public Dept(String dname){
        this.dname = dname;
    }

    // 测试代码
    /*public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDname("").setDeptno(1L);
    }*/
}
