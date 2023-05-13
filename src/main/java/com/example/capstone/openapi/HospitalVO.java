package com.example.capstone.openapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class HospitalVO {
    private Integer id;
    private Long hid;
    private Integer uid;
    private Integer rating;
    private String comment;
}
