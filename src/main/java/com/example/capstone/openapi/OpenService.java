package com.example.capstone.openapi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OpenService {

    private final OpenMapper openMapper;

    public Integer saveHospitalRating(HospitalVO hospitalVO) {
        openMapper.saveHospital(hospitalVO);
        return hospitalVO.getId();
    }

    public Integer savePharmacyRating(PharmacyVO pharmacyVO) {
        openMapper.savePharmacy(pharmacyVO);
        return pharmacyVO.getId();
    }

    public HospitalVO findByIdHospital(Integer id) {
        return openMapper.findByIdHospital(id);
    }

    public PharmacyVO findByIdPharmacy(Integer id) {
        return openMapper.findByIdPharmacy(id);
    }

    public List<HospitalVO> findByHid(Long hid) {
        return openMapper.findByHid(hid);
    }

    public List<PharmacyVO> findByPid(Long pid) {
        return openMapper.findByPid(pid);
    }
}
