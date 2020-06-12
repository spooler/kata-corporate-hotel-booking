package com.kata.domain.company

interface Employees {
    fun add(employee: Employee)
    fun findById(employeeId: Int): Employee?
}
