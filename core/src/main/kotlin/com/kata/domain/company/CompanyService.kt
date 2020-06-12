package com.kata.domain.company

class CompanyService(private val employees: Employees) {
    fun addEmployee(companyId: Int, employeeId: Int) {
        if (employees.findById(employeeId) != null) {
            throw EmployeeAlreadyExistsError()
        }
        val employee = Employee(employeeId, companyId)
        employees.add(employee)
    }
}
