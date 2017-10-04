package com.sports.utils;

import java.util.Collections;
import java.util.Map;
import static com.sports.utils.CollectionUtils.*;

/**
 * Created by Gundam on 2016/9/15.
 */
public class BaseController {
    public static final Map<String, String> SUCCESS = Collections.unmodifiableMap(makeMap("code", "01"));
    public static final Map<String, String> FAILED = Collections.unmodifiableMap(makeMap("code", "02"));
    public static final Map<String, String> ERROR = Collections.unmodifiableMap(makeMap("code", "03"));
    public static final Map<String, String> EMPTYMESSAGE = Collections.unmodifiableMap(makeMap("message", ""));
    public static final Map<String, String> LOGINSUCCESSMESSAGE = Collections.unmodifiableMap(makeMap("message", "登录成功"));
    public static final Map<String, String> LOGINFAILEDMESSAGE = Collections.unmodifiableMap(makeMap("message", "登录失败"));
    public static final Map<String, String> EMPTYRESULT = Collections.unmodifiableMap(makeMap("result", ""));
    public static final Map<String, String> OPERATIONFAILEDMESSAGE = Collections.unmodifiableMap(makeMap("message", "操作失败"));
    public static final Map<String, String> OPERATIONSUCCESSMESSAGE = Collections.unmodifiableMap(makeMap("message", "操作成功"));
    public static final Map<String, String> USER_EXISTED_MESSAGE = Collections.unmodifiableMap(makeMap("message", "该用户已存在"));

}