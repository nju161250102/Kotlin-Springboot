package com.erpnju.dao

import com.erpnju.pojo.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao: CrudRepository<User, String> {
    override fun findAll():List<User>
}