package com.mycloud.domain;

import lombok.Data;

@Data
public class Folder {
    private int no;
    private String userId;
    private String dirName;
    private int parentDirNo;
}
