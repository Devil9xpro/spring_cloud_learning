package com.example.currency_exchangeservice.repository;

import com.example.currency_exchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
    ExchangeValue findByFromAndTo(String from, String to);
}
