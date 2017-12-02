package com.example.demo.service.base;


import java.util.List;

/**
 * Created by Macx on 2017/12/2.
 * 业务基本接口
 */
public interface BaseService<T> {

    void add(T t);

    void delete(Integer id);

    void update(T t);

    T findOne(Integer id);

    List<T> findAll();

    List<T> findByPage(int page,int limit);

    int count();
}
