package com.erpnju.controller

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.erpnju.dao.PurchaserDao
import com.erpnju.pojo.Purchaser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class LoginController(
    @Autowired
    val purchaserDao: PurchaserDao
) {
    @PostMapping("/login")
    fun login(@RequestBody req: JSONObject): JSONObject {
        var res = JSONObject()
        val name = req.getString("name")
        val password = req.getString("key")
        val purchaser: Purchaser? = purchaserDao.findByName(name)
        if (purchaser == null) {
            res["result"] = "该用户名不存在"
        } else {
            if (password == purchaser.password) {
                res["id"] = purchaser.id
                res["name"] = purchaser.name
                res["type"] = "purchaser"
                res["result"] = "success"
            } else res["result"] = "密码错误"
        }
        return res
    }

    @PostMapping("/register")
    fun register(@RequestBody req: JSONObject): JSONObject {
        var res = JSONObject()
        var purchaser: Purchaser ?= purchaserDao.findByName(req.getString("name"))
        if (purchaser == null) {
            purchaser = JSON.parseObject(req.toJSONString(), Purchaser::class.java)
            purchaserDao.save(purchaser)
            res["result"] = "success"
        } else {
            res["result"] = "用户名重复，请更改！"
        }
        return res
    }
}