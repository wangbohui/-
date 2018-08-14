package test;

import org.junit.runner.JUnitCore;

public class Execute {

    public static void main(String[] args) {
//        run(JunitDemo.class, JunitDemo2.class,Sumtest.class);

        run(MeTest.class,Sumtest.class);
    }

    private static void run(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            JUnitCore runner = new JUnitCore();
            ExecutionListener listener = new ExecutionListener();
            runner.addListener(listener);
            runner.run(clazz);
            MyResultRecorder recorder = listener.recorder;
//            System.out.println("recorder 记录信息："+recorder);
            System.out.println("******" + recorder + "*****");
//            System.out.println(recorder.getList());
        }
    }
}