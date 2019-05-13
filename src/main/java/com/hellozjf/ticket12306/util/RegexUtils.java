package com.hellozjf.ticket12306.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jingfeng Zhou
 */
public class RegexUtils {

    /**
     * 从文本中提取一个正则表达式分组信息
     *
     * @param text
     * @param regex
     * @return
     */
    public static String getMatch(String text, String regex) throws IOException {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "";
        }
    }
}
