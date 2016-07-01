package com.iwooto.entity.weichat.response;

import com.iwooto.utils.MessageUtil;

/**
 * Created by Administrator on 14-3-1.
 */
public class TextResponseMessage extends BaseResponseMessage {
    // 回复的消息内容
    private String Content;

    public TextResponseMessage () {
        this.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
    }

    public String getContent () {
        return Content;
    }

    public void setContent (String content) {
        Content = content;
    }
}
