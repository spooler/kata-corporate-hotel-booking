package com.kata.infrastructure

import com.kata.domain.company.Employee
import com.kata.domain.company.Employees

class InMemoryEmployees: Employees {
    private val employees = mutableListOf<Employee>()

    override fun add(employee: Employee) {
        employees.add(employee)
    }

    override fun findById(employeeId: Int): Employee? {
        return employees.find { it.id == employeeId }
    }
}
