package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CredentialForm {
    private String url;
    private String userName;
    private String credentialId;
    private  String password;
}
