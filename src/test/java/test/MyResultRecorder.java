package test;

import java.util.List;

public class MyResultRecorder {

    String script_name;
    List<MethodInfo> list;
    Boolean result;

    public String getScript_name() {
        return script_name;
    }

    public void setScript_name(String script_name) {
        this.script_name = script_name;
    }

    public List<MethodInfo> getList() {
        return list;
    }

    public void setList(List<MethodInfo> list) {
        this.list = list;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
//        return "MyResultRecorder [script_name=" + script_name + ", list=" + list + ", result=" + result + "]";
        return "[测试类是：" + script_name + ", list=" + list + ", 执行结果是result=" + result + "]";
    }
}

