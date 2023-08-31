package com.clone.wanted.likes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LikesResDto {
    private List<String> userNames;
    private int likesNum;
}



