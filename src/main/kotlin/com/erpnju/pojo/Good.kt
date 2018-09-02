package com.erpnju.pojo

import javax.persistence.*

@Entity
@Table(name = "goods")
data class Good (
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int ?= null,
        @Column(name = "name")
        var name: String ?= null,
        @Column(name = "price")
        var price: Double ?= null,
        @Column(name = "unit")
        var unit: String ?= null,
        @Column(name = "stock")
        var stock: Int ?= null,
        @Column(name = "shop")
        var shop: String ?= null,
        @Column(name = "place")
        var place: String ?= null,
        @Column(name = "description")
        var description: String ?= null,
        @Column(name = "category")
        var category: String ?= null
)