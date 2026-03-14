package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/sinhvien")
    public List<SinhVien> getAllSinhVien() {
        return sinhVienService.getAllSinhVien();
    }
}