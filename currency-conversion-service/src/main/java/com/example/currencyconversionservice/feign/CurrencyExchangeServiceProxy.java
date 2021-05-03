package com.example.currencyconversionservice.feign;

import com.example.currencyconversionservice.model.CurrencyConversionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service",url = "localhost:8000")
//not connect to zuul
//@FeignClient(name = "currency-exchange-service")
//not connect to zuul
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service") //use with eureka
public interface CurrencyExchangeServiceProxy {
//    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    //zuul
    @GetMapping("/currency-exchange-service//currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue (@PathVariable String from, @PathVariable String to);
}
