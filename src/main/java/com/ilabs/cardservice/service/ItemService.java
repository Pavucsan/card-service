package com.ilabs.cardservice.service;

import com.ilabs.cardservice.dto.request.CardItemRemoveRequest;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    public boolean removeItem(CardItemRemoveRequest cardItemRemoveRequest);
}
