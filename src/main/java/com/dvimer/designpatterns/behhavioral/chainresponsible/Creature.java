package com.dvimer.designpatterns.behhavioral.chainresponsible;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Creature {
    private String name;
    private int attack;
    private int defense;
}
