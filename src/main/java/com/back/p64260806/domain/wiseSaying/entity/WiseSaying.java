package com.back.p64260806.domain.wiseSaying.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class WiseSaying {
    private int id;
    private String content;
    private String author;

    public void update(String content, String author) {
        this.content = content;
        this.author = author;
    }
}
