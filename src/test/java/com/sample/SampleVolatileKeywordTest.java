package com.sample;

import org.junit.Test;

public class SampleVolatileKeywordTest {

    @Test
    public void test() {

        SampleVolatileKeyword sampleVolatileKeyword = new SampleVolatileKeyword();
        SampleVolatileKeyword.ThreadOne threadOne = sampleVolatileKeyword.getThreadOne();
        SampleVolatileKeyword.ThreadTwo threadTwo = sampleVolatileKeyword.getThreadTwo();

        threadOne.start();
        threadTwo.start();
    }
}
