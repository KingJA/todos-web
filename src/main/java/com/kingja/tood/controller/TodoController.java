package com.kingja.tood.controller;

import com.kingja.tood.dao.TodoDao;
import com.kingja.tood.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description：TODO
 * Create Time：2017/12/18 13:07
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@RestController
@RequestMapping(value = "/api")
public class TodoController {
    @Autowired
    private TodoDao todoDao;

    /*解决跨域访问*/
    @CrossOrigin
    @GetMapping(value = "/todos")
    public List<Todo> getTodo() {
        return todoDao.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/todo")
    public Todo addTodo(@RequestBody Todo todo) {
        System.out.println("getAction:"+todo.getAction());
        return todoDao.save(todo);
    }

}
