package com.erpnju.pojo

import javax.persistence.*

@Entity
@Table(name = "SystemUser")
data class User (
        @Id
        @Column(name = "SUID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: String ?= null,
        @Column(name = "SUName")
        var name: String ?= null,
        @Column(name = "SUPwd")
        var password: String ?= null,
        @Column(name = "SUSex")
        var sex: String ?= null,
        @Column(name = "SUTel")
        var telNumber: String ?= null,
        @Column(name = "SUBirth")
        var birth: String ?= null,
        @Column(name = "SURank")
        var rank: Int ?= null,
        @Column(name = "SUDept")
        var type: Int ?= null,
        @Column(name = "SUIsExist")
        var active: Boolean ?= null
)