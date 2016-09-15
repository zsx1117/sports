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



}
