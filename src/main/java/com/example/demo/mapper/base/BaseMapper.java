package com.example.demo.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Macx on 2017/12/2.
 */
public interface BaseMapper<T> {

    void add(T t);

    void delete(Integer id);

    void update(T t);

    T findOne(Integer id);

    List<T> findAll();

    List<T> findByPage(@Param("page") int page,@Param("limit") int limit);

    int count();
}
