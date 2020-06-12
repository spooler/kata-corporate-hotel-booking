package com.kata.domain

import com.kata.domain.company.CompanyService
import com.kata.domain.company.Employee
import com.kata.domain.company.EmployeeAlreadyExistsError
import com.kata.domain.company.Employees
import io.mockk.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CompanyServiceTest{
    @Test fun `add new employee with the given information`() {
        val employee = Employee(someEmployeeId, someCompanyId)

        companyService.addEmployee(someCompanyId, someEmployeeId)

        verify { employees.add(employee) }
    }

    @Test fun `fail if employee already exists`() {
        every { employees.findById(someEmployeeId) } returns Employee(someEmployeeId, someCompanyId)

        assertThrows<EmployeeAlreadyExistsError> { companyService.addEmployee(someCompanyId, someEmployeeId) }
    }

    private val employees = mockk<Employees>(relaxed = true)
    private val companyService = CompanyService(employees)
    private val someCompanyId = 15
    private val someEmployeeId = 1000
}
