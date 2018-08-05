package com.roncoo.es.score.first;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * JSON tool
 *
 */
public class JsonUtil {

    public static String objectToJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static String objectToJsonWithDateFormat(Object obj, String timeFormat, SerializerFeature serializerFeature) {
        return JSON.toJSONStringWithDateFormat(obj, timeFormat, serializerFeature);
    }

    public static <T> List<T> jsonToList(String jsonStr, Class<T> clazz) {
        return JSON.parseArray(jsonStr, clazz);
    }

    public static Map<String, Object> jsonToMap(String jsonStr) {
        return JSON.parseObject(jsonStr);
    }

    public static <T> T jsonToObject(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    @SuppressWarnings(value={"rawtypes"})
    public static <T> List mapKeyGetList(Map map, String key, Class<T> clazz) {
        JSONArray arr = (JSONArray)map.get(key);
        return JSON.parseArray(arr.toString(), clazz);
    }

    @SuppressWarnings(value={"rawtypes"})
    public static Map[] mapKeyGetMap(Map map, String key) {
        List<Map> list = mapKeyGetList(map, key, Map.class);
        return list.toArray(new HashMap[list.size()]);
    }

}