package com.back.p64260806.domain.wiseSaying.controller;

import com.back.p64260806.domain.wiseSaying.entity.WiseSaying;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class WiseSayingController {
    private List<WiseSaying> wiseSayings = new ArrayList<>();
    private int lastId=0;

    @GetMapping("/wiseSaying/write")
    @ResponseBody
    public String actionAdd(String content, String author) {

        if(author.isEmpty()){
            throw new IllegalArgumentException("작가 내용이 비어있습니다.");
        }
        if(content.isEmpty()){
            throw new IllegalArgumentException("명언 내용이 비어있습니다.");
        }

        WiseSaying wiseSaying = new WiseSaying(content, author);
        wiseSaying.setId(++lastId);
        wiseSayings.add(wiseSaying);

        return "%d번 명언이 등록되었습니다.".formatted(wiseSaying.getId());
    }

    @GetMapping("/wiseSaying/delete/{id}")
    @ResponseBody
    public String delete(
            @PathVariable int id
    ) {

        Optional<WiseSaying> wiseSaying = wiseSayings.stream()
                .filter(w -> w.getId() == id)
                .findFirst();

        if(wiseSaying.isEmpty()) {
            throw new RuntimeException("%d번 명언은 존재하지 않습니다.".formatted(id));
        }

        wiseSayings.remove(wiseSaying.get());

        return "%d번 명언이 삭제되었습니다".formatted(id);
    }
}
