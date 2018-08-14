package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

public class CompareJSON {

    public static void main(String[] args) {
        String s = "{\"properties\":{\"packet\":{\"recorded_at\":\"2015-09-02 04:45:45 +0000\",\"userId\":\"100000000000001\",\"meta\":{\"account\":\"xxx\",\"event\":\"track\"},\"fields\":{\"gyroData\":{\"rotation_y\":-1,\"rotation_z\":-1,\"rotation_x\":-1},\"accelerometerData\":{\"acceleration_x\":-1,\"acceleration_z\":-1,\"acceleration_y\":-1},\"location\":{\"speed\":4.68,\"speed_course\":0.7,\"horizontal_accuracy\":10,\"longtitude\":-122.02359082,\"vertical_accuracy\":-1,\"latitude\":37.33385024},\"pedometerData\":{\"step_count\":0}},\"recorded_sample_rate\":5}},\"geometry\":{\"type\":\"Point\",\"coordinates\":[37.33385024,-122.02359082]},\"type\":\"Feature\"}";
        String s2 = "{\"properties\":{\"packet\":{\"recorded_at\":\"2015-09-02 04:45:45 +0000\",\"userId\":\"100000000000001\",\"meta\":{\"account\":\"xxx\",\"event\":\"track\"},\"fields\":{\"gyroData\":{\"rotation_y\":-1,\"rotation_z\":-1,\"rotation_x\":-1},\"accelerometerData\":{\"acceleration_x\":-1,\"acceleration_z\":-1,\"acceleration_y\":-1},\"location\":{\"speed\":4.68,\"speed_course\":0.7,\"horizontal_accuracy\":10,\"longtitude\":-122.02359082,\"vertical_accuracy\":-1,\"latitude\":37.33385024},\"pedometerData\":{\"step_count\":0}},\"recorded_sample_rate\":5}},\"geometry\":{\"type\":\"Point\",\"coordinates\":[37.33385024,-122.02359082]},\"type\":\"Feature\"}";
        JSONObject sJSON = (JSONObject) JSON.parseObject(s);
        JSONObject s2JSON = (JSONObject) JSON.parseObject(s2);
        System.out.println(sJSON.equals(s2JSON));

        for (int i=0;i<20;i++) {
            BigDecimal numBig = new BigDecimal(String.valueOf(Math.random()));
            System.out.println(numBig.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        }


//        Person p1 = new Person("Lisi","20");
//        Person p2 = new Person("Lisi","200");
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//
//        JSONObject p1JSON = (JSONObject) JSON.toJSON(p1);
//        JSONObject p2JSON = (JSONObject) JSON.toJSON(p2);
//        System.out.println(p1JSON.equals(p2JSON));

    }
}
