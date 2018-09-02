package com.erpnju.pojo

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "purchasers")
data class Purchaser (
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int ?= null,
        @Column(name = "name")
        var name: String ?= null,
        @Column(name = "password")
        var password: String ?= null,
        @Column(name = "sex")
        var sex: String ?= null,
        @Column(name = "birth")
        var birth: Date ?= null,
        @Column(name = "phone")
        var phone: String ?= null,
        @Column(name = "email")
        var email: String ?= null,
        @Column(name = "address")
        var address: String ?= null,
        @Column(name = "balance")
        var balance: Double ?= null
)