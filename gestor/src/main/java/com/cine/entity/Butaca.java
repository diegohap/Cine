package com.cine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Data
@Builder
public class Butaca {
    private String uuid;
    private Integer num;
    private Boolean estado;
    private Boolean premium;
}
