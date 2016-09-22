package action;

import utils.CollectionUtils;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Gundam on 2016/9/15.
 */
public class BaseController {
    public static final Map<String,String> SUCCESS = Collections.unmodifiableMap(CollectionUtils.makeMap("code","01"));
    public static final Map<String,String> FAILED = Collections.unmodifiableMap(CollectionUtils.makeMap("code","02"));
    public static final Map<String,String> ERROR = Collections.unmodifiableMap(CollectionUtils.makeMap("code","03"));
    public static final Map<String,String> EMPTYMESSAGE =  Collections.unmodifiableMap(CollectionUtils.makeMap("message",null));
    public static final Map<String,String> LOGINSUCCESSMESSAGE =  Collections.unmodifiableMap(CollectionUtils.makeMap("message","登录成功"));
    public static final Map<String,String> LOGINFAILEDMESSAGE =  Collections.unmodifiableMap(CollectionUtils.makeMap("message","登录失败"));
    public static final Map<String,String> EMPTYRESULT =  Collections.unmodifiableMap(CollectionUtils.makeMap("result",null));
    public static final Map<String,String> OPERATIONFAILEDMESSAGE =  Collections.unmodifiableMap(CollectionUtils.makeMap("message","操作失败"));
    public static final Map<String,String> OPERATIONSUCCESSMESSAGE =  Collections.unmodifiableMap(CollectionUtils.makeMap("message","操作成功"));


}
