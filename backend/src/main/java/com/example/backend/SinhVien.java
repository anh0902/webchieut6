package com.example.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_sinh_vien")
    private String maSinhVien;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "lop")
    private String lop;

    @Column(name = "ngay_tao")
    private LocalDateTime ngayTao;

    // Constructors
    public SinhVien() {}

    public SinhVien(String maSinhVien, String hoTen, String lop, LocalDateTime ngayTao) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngayTao = ngayTao;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public LocalDateTime getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDateTime ngayTao) {
        this.ngayTao = ngayTao;
    }
}