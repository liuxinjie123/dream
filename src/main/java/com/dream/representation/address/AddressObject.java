package com.dream.representation.address;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AddressObject implements Serializable {
    private Long id;
    private String provinceCode;
    private String provinceName;
    private String cityCode;
    private String cityName;
    private String countryCode;
    private String countryName;
    private String detailAddress;
}
