package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity //Сущность таблицы в БД
public class Message {

    @Id //Говорим, что это идентификатор
    @GeneratedValue(strategy= GenerationType.AUTO) //Генерация идентификаторов
    private Integer id;

    private String text;
    private String tag;

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

}
