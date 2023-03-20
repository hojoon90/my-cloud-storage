package com.mycloud.domain;

import lombok.Data;

@Data
public class File {

    private int no;
    private int folderNo;
    private String userId;
    private String fileName;
    private String location;
    private int fileSize;
    private String deleteYn;
    private String moveYn;

}
