package com.example.grocerymanagement.service;

import com.example.grocerymanagement.dao.jdbc.DashboardJDBCDao;
import com.example.grocerymanagement.model.dto.DashboradDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private DashboardJDBCDao dashboardJDBCDao;


    public DashboradDTO getAllValue() {
        DashboradDTO dashboardDTO = this.dashboardJDBCDao.getAllValuesJDBC();
        return dashboardDTO;
    }
}
