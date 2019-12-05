package com.example.electronicsapp

class ProductModel {
    var id: String
    var title: String
    var price :Int
    var color: String
    var image : Int
    var desc: String


    constructor(id: String, title: String, price: Int, color: String, image: Int, desc: String) {
        this.id = id
        this.title = title
        this.price = price
        this.color = color
        this.image = image
        this.desc = desc
    }
}