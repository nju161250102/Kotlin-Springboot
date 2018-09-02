package com.erpnju.dao

import com.erpnju.pojo.Good
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GoodDao: CrudRepository<Good, Int> {

    override fun findAll(): List<Good>

    fun findByCategory(category: String): List<Good>
}