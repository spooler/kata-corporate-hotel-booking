package com.kata.domain

interface BookingPolicyService {
    fun setCompanyPolicy(companyId: ?, roomTypes: ?)
    fun setEmployeePolicy(employeeId: ?, roomTypes: ?)
    fun isBookingAllowed(employeeId: ?, roomType: ?): Boolean
}
