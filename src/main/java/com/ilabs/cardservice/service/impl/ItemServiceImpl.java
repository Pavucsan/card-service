package com.ilabs.cardservice.service.impl;

import com.ilabs.cardservice.dto.request.CardItemRemoveRequest;
import com.ilabs.cardservice.repository.ItemRepository;
import com.ilabs.cardservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public boolean removeItem(CardItemRemoveRequest cardItemRemoveRequest) {
        itemRepository.removeCaItem(cardItemRemoveRequest.getCardId(), cardItemRemoveRequest.getItemId());
        return true;
    }
}
