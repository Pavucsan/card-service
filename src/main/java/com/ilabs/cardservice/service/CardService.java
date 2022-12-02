package com.ilabs.cardservice.service;

import com.ilabs.cardservice.entity.Card;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardService {

    public List<Card> getItem();

    public Card addItem();

    public boolean removeItem();
}
