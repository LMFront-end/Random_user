package com.example.userwebflux.application.utils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class RandomStringGenerator {

    private final Random random = new Random();
    private static final String ALPHABET = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z," +
            "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z," +
            "1,2,3,4,5,6,7,8,9,0,@,$,#";

    public String generateString(Integer length){
        return Arrays.stream(new String[length])
                .reduce("", (value, accum) ->
                        value.concat(ALPHABET.split(",")[random.nextInt(ALPHABET.split(",").length - 1)]));
    }
}
