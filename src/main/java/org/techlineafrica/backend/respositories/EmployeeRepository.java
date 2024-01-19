package org.techlineafrica.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techlineafrica.backend.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}