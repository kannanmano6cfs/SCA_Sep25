package com.learning.payrollservice.Service;

import com.learning.payrollservice.Model.Department;
import com.learning.payrollservice.Model.Payroll;
import com.learning.payrollservice.Repository.payrollRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {

    @Autowired
    private payrollRepository repo;

    // Listens for messages on the configured queue
    @RabbitListener(queues = "payroll.info.queue")
    public void handleDepartmentCreated(Department dept) {
        // This method executes asynchronously when a message arrives

        System.out.println("--- RECEIVED ASYNCHRONOUS MESSAGE ---");
        System.out.println("New Department Created for Payroll: " + dept.getDepname());

        Payroll pay=new Payroll();
        pay.setEmpname(dept.getEmpname());
        pay.setDeptname(dept.getDepname());
        pay.setBasic(0.00);
        pay.setDA(0.00);
        pay.setHRA(0.00);
        pay.setPF(0.00);
        pay.setGross(0.00);
        repo.save(pay);
    }
}
