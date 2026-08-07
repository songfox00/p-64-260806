package com.back.p64260806.domain.wiseSaying.entity;

import com.back.p64260806.global.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class WiseSaying extends BaseEntity {
    private String content;
    private String author;
}
