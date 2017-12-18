package com.kingja.tood.dao;

import com.kingja.tood.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Description：TODO
 * Create Time：2017/12/18 13:10
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Transactional
public interface TodoDao extends JpaRepository<Todo, Integer> {

}
