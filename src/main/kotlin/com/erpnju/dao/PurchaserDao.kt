package com.erpnju.dao

import com.erpnju.pojo.Purchaser
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PurchaserDao: CrudRepository<Purchaser, Int> {
    fun findByName(name: String): Purchaser?
}