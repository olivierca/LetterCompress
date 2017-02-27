package com.simplon;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterCompressTest {

    @Test
    public void TestOK() {
        // set
        LetterCompress compress = new LetterCompress();
        //test
        String result = compress.LetterComp("aabcccccaaa");
        // assert
        assertEquals("a5b1c5",result);
    }

    @Test
    public void TestKO() {
        // set
        LetterCompress compress = new LetterCompress();
        //test
        String result = compress.LetterComp("aabcccddaaa");
        // assert
        assertEquals("a5b1c5",result);
    }

    @Test
    public void TestNULL() {
        // set
        LetterCompress compress = new LetterCompress();
        //test
        String result = compress.LetterComp("");
        // assert
        assertEquals("a5b1c5",result);
    }
}