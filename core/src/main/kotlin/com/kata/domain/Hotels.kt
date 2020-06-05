package com.kata.domain

interface Hotels {
    fun nextId(): Int
    fun get(id: Int): Hotel
}
