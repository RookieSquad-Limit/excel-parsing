package com.rookiesquad.excelparsing.controller;

import com.rookiesquad.excelparsing.service.ExcelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    private final ExcelService excelService;

    public ExcelController(ExcelService excelService) {
        this.excelService = excelService;
    }

    @GetMapping("/test")
    public void testRead(Long batchNumber){
        excelService.testRead(batchNumber);
    }

    @PostMapping("/reconciliation-data")
    public void parsingExcel(Long batchNumber){
        excelService.parsingExcel(batchNumber);
    }

}
