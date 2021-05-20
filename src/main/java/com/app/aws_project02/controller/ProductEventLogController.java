package com.app.aws_project02.controller;

import com.app.aws_project02.repository.ProductEventLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductEventLogController {

    private ProductEventLogRepository productEventLogRepository;

    @Autowired
    public ProductEventLogController(ProductEventLogRepository productEventLogRepository) {

        this.productEventLogRepository = productEventLogRepository;
    }
}
