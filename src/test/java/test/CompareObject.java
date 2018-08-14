package test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareObject {
    public static List<Map<String,Object>> compareTwoObject(Object expect, Object actual){
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
//        获取对象的class
        Class<?> clazzExpect = expect.getClass();
        Class<?> clazzActual = actual.getClass();
//        获取对象的属性列表
        Field[] fileldsExpect = clazzExpect.getDeclaredFields();
        Field[] fileldsActual = clazzActual.getDeclaredFields();
        //遍历属性列表fileldsExpect  
        for (int i = 0; i < fileldsExpect.length; i++) {
            //遍历属性列表fileldsActual  
            for (int j = 0; j < fileldsActual.length; j++) {
                //如果fileldsExpect[i]属性名与fileldsActual[j]属性名内容相同  
                if (fileldsExpect[i].getName().equals(fileldsActual[j].getName())) {
                    fileldsExpect[i].setAccessible(true);
                    fileldsActual[j].setAccessible(true);
                    //如果fileldsExpect[i]属性值与fileldsActual[j]属性值内容不相同  
                    try {
                        if (!compare(fileldsExpect[i].get(clazzExpect), fileldsActual[j].get(clazzActual))) {
                            Map<String, Object> map2 = new HashMap<String, Object>();
                            map2.put("name", fileldsExpect[i].getName());
                            map2.put("old", fileldsExpect[i].get(clazzExpect));
                            map2.put("new", fileldsActual[j].get(clazzActual));
                            list.add(map2);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
        return list;
    }

    public static Boolean compare(Object expect,Object actual){
        if(expect == null && actual == null){
            return  true;
        }
        //有时会出现源数据是没有进行赋值，因此是null；而通过EditText获取值的时候，虽然没有值，但是会变成""，但是本质是没有赋值的。
        if (expect == "" && actual == null) {
            return true;
        }
        if (expect == null && actual == "") {
            return true;
         }
        if (expect == null && actual != null) {
            return false;
        }
        if (expect.equals(actual)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(compare("123","123"));
    }
}
