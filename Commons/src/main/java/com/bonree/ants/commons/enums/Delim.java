package com.bonree.ants.commons.enums;

/**
 * *****************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @Date: 2018年4月12日 下午3:32:23
 * @Author: <a href=mailto:zhangnl@bonree.com>张念礼</a>
 * @Description: 分割符
 * ****************************************************************************
 */
public enum Delim {
    NONE(""),
    UNDERLINE("_"),
    BLANK(" "),
    LINE_FEED_LINUX("\n"),
    LINE_FEED_WIN("\r\n"),
    ASCII_159("ƒ"),
    COMMA(","),
    SPRIT("/"),
    SEMICOLON(";"),
    DOT("."),
    COLON(":"),
    SIGN("#");
    private String delim;

    Delim(String delim) {
        this.delim = delim;
    }

    public String value() {
        return delim;
    }
}
