package com.hunau.myweather.entity;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 刘晟
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import lombok.Data;

import java.io.Serializable;

@Data
public class Yesterday implements Serializable {



    /**
     * 日期
     */
    private String date;

    /**
     * 高温
     */
    private String high;

    /**
     * 风向
     */
    private String fx;

    /**
     * 低温
     */
    private String low;

    /**
     * 风力
     */
    private String fl;

    /**
     * 类型：大雨、多云、晴...
     */
    private String type;
}
