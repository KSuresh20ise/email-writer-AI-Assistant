package com.email_writer_ai;

import lombok.Data;



@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
