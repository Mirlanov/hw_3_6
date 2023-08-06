package com.example.hw_3_6

data class Song(
    val number:Int,
    val name:String ? = "Название композиции",
    val author:String ? = "Автор композиции",
    val duration:Double
):java.io.Serializable