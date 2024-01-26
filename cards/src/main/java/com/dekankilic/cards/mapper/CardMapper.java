package com.dekankilic.cards.mapper;

import com.dekankilic.cards.dto.CardDto;
import com.dekankilic.cards.entity.Card;

public class CardMapper {
    public static CardDto mapToCardDto(Card card, CardDto cardDto){
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardType(card.getCardType());
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setMobileNumber(card.getMobileNumber());
        cardDto.setTotalLimit(card.getTotalLimit());
        cardDto.setAmountUsed(card.getAmountUsed());
        cardDto.setAvailableAmount(card.getAvailableAmount());
        return cardDto;
    }
    public static Card mapToCard(CardDto cardDto, Card card){
        card.setCardNumber(cardDto.getCardNumber());
        card.setCardType(cardDto.getCardType());
        card.setCardNumber(cardDto.getCardNumber());
        cardDto.setMobileNumber(cardDto.getMobileNumber());
        card.setTotalLimit(cardDto.getTotalLimit());
        card.setAmountUsed(cardDto.getAmountUsed());
        card.setAvailableAmount(cardDto.getAvailableAmount());
        return card;
    }
}
