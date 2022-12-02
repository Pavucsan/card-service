package com.ilabs.cardservice.service.impl;

import com.ilabs.cardservice.entity.Card;
import com.ilabs.cardservice.repository.CardRepository;
import com.ilabs.cardservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    private CardRepository cardRepository;

    @Autowired
    public void setCardRepository(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> getItem() {
        return cardRepository.findAll();
    }

    @Override
    public Card addItem() {
        return null;
    }

    @Override
    public boolean removeItem() {
        return false;
    }
}
