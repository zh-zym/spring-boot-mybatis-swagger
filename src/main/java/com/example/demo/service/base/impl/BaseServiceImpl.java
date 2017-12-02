package com.example.demo.service.base.impl;

import com.example.demo.mapper.base.BaseMapper;
import com.example.demo.service.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Macx on 2017/12/2.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseMapper<T> getMapper();

    @Override
    public void add(T t) {
        getMapper().add(t);
    }

    @Override
    public void delete(Integer id) {
        getMapper().delete(id);
    }

    @Override
    public void update(T t) {
        getMapper().update(t);
    }

    @Override
    public T findOne(Integer id) {
        return getMapper().findOne(id);
    }

    @Override
    public List<T> findAll() {
        return getMapper().findAll();
    }

    @Override
    public List<T> findByPage(int page, int limit) {
        return getMapper().findByPage((page-1)*limit,limit);
    }

    @Override
    public int count() {
        return getMapper().count();
    }
}
