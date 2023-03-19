CREATE TABLE `USER`
(
    `USER_ID`     varchar(15)  NOT NULL COMMENT '사용자 아이디',
    `SECRET_KEY`  varchar(100) NOT NULL COMMENT '비밀번호',
    `USE_STORAGE` int          NOT NULL COMMENT '사용 용량',
    `REG_DATE`    datetime     NOT NULL COMMENT '등록 일자',
    `ALT_DATE`    datetime     NULL COMMENT '수정 일자'
);

CREATE TABLE `USER_FOLDER`
(
    `NO`            int         NOT NULL COMMENT '번호',
    `USER_ID`       varchar(15) NOT NULL COMMENT '사용자 아이디',
    `DIR_NAME`      varchar(60) NOT NULL COMMENT '사용자 경로',
    `PARENT_DIR_NO` int         NULL COMMENT '부모 경로 번호',
    `REG_DATE`      datetime    NOT NULL COMMENT '등록일',
    `ALT_DATE`      datetime    NULL COMMENT '수정일'
);

CREATE TABLE `FILE_INFO`
(
    `NO`        int          NOT NULL COMMENT '번호',
    `FOLDER_NO` int          NOT NULL COMMENT '폴더 번호',
    `USER_ID`   varchar(15)  NOT NULL COMMENT '사용자 아이디',
    `FILE_NAME` varchar(500) NOT NULL COMMENT '파일 이름',
    `LOCATION`  varchar(500) NOT NULL COMMENT '파일 경로',
    `FILE_SIZE` int          NOT NULL COMMENT '파일 사이즈',
    `DELETE_YN` char         NULL DEFAULT 'N' COMMENT '파일 삭제 여부',
    `MOVE_YN`   char         NULL DEFAULT 'N' COMMENT '이동 여부',
    `REG_DATE`  datetime     NOT NULL COMMENT '등록일',
    `ALT_DATE`  datetime     NULL COMMENT '수정일'
);

ALTER TABLE `USER`
    ADD CONSTRAINT `PK_USER` PRIMARY KEY (
                                          `USER_ID`
        );

ALTER TABLE `USER_FOLDER`
    ADD CONSTRAINT `PK_USER_FOLDER` PRIMARY KEY (
                                                 `NO`,
                                                 `USER_ID`
        );

ALTER TABLE `FILE_INFO`
    ADD CONSTRAINT `PK_FILE_INFO` PRIMARY KEY (
                                               `NO`,
                                               `FOLDER_NO`,
                                               `USER_ID`
        );

ALTER TABLE `USER_FOLDER`
    ADD CONSTRAINT `FK_USER_TO_USER_FOLDER_1` FOREIGN KEY (
                                                           `USER_ID`
        )
        REFERENCES `USER` (
                           `USER_ID`
            );

ALTER TABLE `FILE_INFO`
    ADD CONSTRAINT `FK_USER_FOLDER_TO_FILE_INFO_1` FOREIGN KEY (
                                                                `FOLDER_NO`
        )
        REFERENCES `USER_FOLDER` (
                                  `NO`
            );

ALTER TABLE `FILE_INFO`
    ADD CONSTRAINT `FK_USER_FOLDER_TO_FILE_INFO_2` FOREIGN KEY (
                                                                `USER_ID`
        )
        REFERENCES `USER_FOLDER` (
                                  `USER_ID`
            );

