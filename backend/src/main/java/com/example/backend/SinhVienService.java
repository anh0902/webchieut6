package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SinhVienService {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    public List<SinhVien> getAllSinhVien() {
        return sinhVienRepository.findAll();
    }
}