package com.erpnju.controller

import com.erpnju.dao.AccountDao
import com.erpnju.dao.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    @Autowired
    var userDao: UserDao
) {
    @GetMapping("")
    fun getAllUsers() = userDao.findAll()

    @GetMapping("/{id}")
    fun getUser(@PathVariable("id") id:String) = userDao.findById(id)
}