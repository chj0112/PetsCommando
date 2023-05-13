package com.example.capstone.openapi;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OpenMapper {
    void saveHospital(HospitalVO hospitalVO);

    void savePharmacy(PharmacyVO pharmacyVO);

    HospitalVO findByIdHospital(Integer id);

    PharmacyVO findByIdPharmacy(Integer id);

    List<HospitalVO> findByHid(Long hid);

    List<PharmacyVO> findByPid(Long pid);
}
