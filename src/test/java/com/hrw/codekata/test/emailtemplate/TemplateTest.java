
package com.hrw.codekata.test.emailtemplate;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.emailtemplate.Template;

public class TemplateTest {
    @Test
    public void should_return_hello_reader_when_input_reader() {
        Template template = new Template("Hello,${name}");
        template.set("name", "Reader");
        assertEquals("Hello,Reader", template.evaluate());
    }

    @Test
    public void should_return_hello_reader_when_input_someone() {
        Template template = new Template("Hello,${name}");
        template.set("name", "someone");
        assertEquals("Hello,someone", template.evaluate());
    }

    @Test
    public void should_return_hi_reader_when_input_someone() {
        Template template = new Template("Hi,${name}");
        template.set("name", "someone");
        assertEquals("Hi,someone", template.evaluate());
    }

}
