package com.dvimer.designpatterns.creational.prototype.serializationcopy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Foo implements Serializable {
    private String stuff;
    private String whatewer;
}
