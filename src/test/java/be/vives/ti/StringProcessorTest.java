package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringProcessorTest {
    @Test
    public void withSuffixDoNothing(){
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hello world", "hello world");
        assertEquals("hello world", result);

    }
    @Test
    public void withoutSuffix(){
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("", "hello world");
        assertEquals("hello world", result);

    }

}