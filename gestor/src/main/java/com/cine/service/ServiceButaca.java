package com.cine.service;

import com.cine.entity.Butaca;

import java.util.List;


public class ServiceButaca extends Service<Butaca> {
    public static final Double BUTACA_PREMIUM_PRICE_EXTRA = 2000.0;
    public ServiceButaca(List<Butaca> butacas) {
        super(butacas);
    }
}
