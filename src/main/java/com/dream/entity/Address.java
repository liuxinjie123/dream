package com.dream.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "h_dream_address")
@Data
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "province_code", length = 50)
    private String provinceCode;
    @Column(name = "province_name", length = 50)
    private String provinceName;
    @Column(name = "city_code", length = 50)
    private String cityCode;
    @Column(name = "city_name", length = 50)
    private String cityName;
    @Column(name = "country_code", length = 50)
    private String countryCode;
    @Column(name = "country_name", length = 50)
    private String countryName;
    @Column(name = "detail_address", length = 50)
    private String detailAddress;

}
