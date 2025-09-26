package com.cine.service;

import com.cine.entity.Butaca;

import java.util.List;


public class ServiceButaca extends Service<Butaca> {
    private static ServiceButaca instance;
    public static final Double BUTACA_PREMIUM_PRICE_EXTRA = 2000.0;

    private ServiceButaca(List<Butaca> butacas) {
        super(butacas);
    }
    public static ServiceButaca getInstance() {
        if (instance == null) {
            instance = new ServiceButaca(new java.util.ArrayList<>());
        }
        return instance;
    }
}
