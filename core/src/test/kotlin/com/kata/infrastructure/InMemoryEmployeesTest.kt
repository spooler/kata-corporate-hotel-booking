package com.kata.infrastructure

import com.kata.domain.company.Employee
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InMemoryEmployeesTest {
    @Test fun `add an employee`() {
        val employees = InMemoryEmployees()
        val employeeId = 2
        val companyId = 3
        val employee = Employee(employeeId, companyId)

        employees.add(employee)

        assertThat(employees.findById(employeeId)?.id).isEqualTo(employeeId)
    }
}