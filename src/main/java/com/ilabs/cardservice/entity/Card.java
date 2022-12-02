package com.ilabs.cardservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long card_id;

    @OneToMany(mappedBy = "cart")
    private Set<Items> cartItem;

    @Override
    public String toString() {
        return "Card{" +
                "card_id=" + card_id +
                ", cartItem=" + cartItem +
                '}';
    }
}
