package com.erpnju.controller

import com.erpnju.dao.GoodDao
import com.erpnju.pojo.Good
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/goods")
class GoodController (
    @Autowired
    val goodDao: GoodDao
){
    @GetMapping("")
    fun getGoods(@RequestParam("type") type: String): List<Good> {
        return if (type == "all") {
            goodDao.findAll()
        } else {
            goodDao.findByCategory(type)
        }
    }

    @GetMapping("/{id}")
    fun getOneGood(@PathVariable id: Int) = goodDao.findById(id)
}