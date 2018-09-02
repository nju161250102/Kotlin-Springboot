package com.erpnju.controller

import com.erpnju.dao.PurchaserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class PurchaserController(
    @Autowired
    var purchaserDao: PurchaserDao
) {
    @GetMapping("")
    fun getAllUsers() = purchaserDao.findAll()

    @GetMapping("/{name}")
    fun getUser(@PathVariable("name") name: String) = purchaserDao.findByName(name)
}