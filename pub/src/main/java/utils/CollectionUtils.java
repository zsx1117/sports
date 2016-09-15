package utils;

import java.util.*;

/**
 * Created by Gundam on 2016/9/15.
 */
public class CollectionUtils {
        private CollectionUtils() {
        }

        public static <T> boolean isNullOrEmpty(Collection<T> collection) {
            return collection == null || collection.isEmpty();
        }

        public static <T> boolean isNotNullOrEmptyArray(T[] array) {
            return array != null && array.length != 0;
        }

        public static <T> List<T> mergeAll(List... lists) {
            ArrayList mergedList = new ArrayList();
            int i = 0;

            for(int len = lists.length; i < len; ++i) {
                List list = lists[i];
                if(list != null && !list.isEmpty()) {
                    int j = 0;

                    for(int lenj = list.size(); j < lenj; ++j) {
                        Object obj = list.get(j);
                        if(obj != null) {
                            mergedList.add(obj);
                        }
                    }
                }
            }

            return mergedList;
        }

        public static <T> List<T> asList(T... objs) {
            if(objs == null) {
                return Collections.EMPTY_LIST;
            } else {
                ArrayList list = new ArrayList();
                Collections.addAll(list, objs);
                return list;
            }
        }

        public static <K, V> Map<K, V> makeMap(K key, V value) {
            HashMap map = new HashMap();
            map.put(key, value);
            return map;
        }

        public static <K, V> Map<K, V> makeMap(K key1, V value1, K key2, V value2) {
            HashMap map = new HashMap();
            map.put(key1, value1);
            map.put(key2, value2);
            return map;
        }

        public static <T> boolean contains(T[] array, T val) {
            Object[] arr$ = array;
            int len$ = array.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                Object t = arr$[i$];
                if(val.equals(t)) {
                    return true;
                }
            }

            return false;
        }

        public static String join(Object[] words, String seperator) {
            StringBuilder sb = new StringBuilder();
            if(words != null) {
                for(int i = 0; i < words.length; ++i) {
                    sb.append(words[i]);
                    if(i < words.length - 1) {
                        sb.append(seperator);
                    }
                }
            }

            return sb.toString();
        }

        public static String join(Collection<?> collection, String seperator) {
            Object[] objs = new Object[collection.size()];
            collection.toArray(objs);
            return join(objs, seperator);
        }

    }
