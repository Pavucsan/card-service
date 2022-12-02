package com.ilabs.cardservice.controller;

import com.ilabs.cardservice.constant.Constant;
import com.ilabs.cardservice.dto.response.CommonResponse;
import com.ilabs.cardservice.entity.Card;
import com.ilabs.cardservice.enumaration.StatusCode;
import com.ilabs.cardservice.service.CardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    Logger log = LoggerFactory.getLogger(this.getClass());
    private CardService cardService;

    @Autowired
    public void setCardService(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public ResponseEntity<CommonResponse> getCard() {
        log.info(Constant.GET_CARD_LIST);
        CommonResponse response = new CommonResponse();
        List<Card> cardList;

        try {
            cardList = cardService.getItem();

            response.setData(cardList);
            response.setMessage(StatusCode.SUCCESS.getValue());
            response.setStatusCode(StatusCode.SUCCESS.getCode());

            log.info(Constant.THREE_VALUES, Constant.GET_CARD_LIST, Constant.SUCCESS, response);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(Constant.FOUR_VALUES, Constant.GET_CARD_LIST, Constant.ERROR, ex.getMessage(), ex);
            response.setMessage(StatusCode.ERROR.getValue());
            response.setStatusCode(StatusCode.ERROR.getCode());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public CommonResponse addCard() {
        return null;
    }

    public CommonResponse removeItem() {
        return null;
    }
}
