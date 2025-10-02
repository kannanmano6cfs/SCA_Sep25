package com.learning.payrollservice.Repository;

import com.learning.payrollservice.Model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface payrollRepository extends JpaRepository<Payroll, Integer>{

}
