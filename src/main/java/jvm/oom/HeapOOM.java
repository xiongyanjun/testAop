package jvm.oom;

import java.util.ArrayList;

/**
 * @author : xiongyanjun  Date: 2020/12/23 ProjectName: settleprovisions Version: 1.0
 */
public class HeapOOM
{
    static class OOMObj{}

    public static void main(String[] args) {
        ArrayList<OOMObj> oomObjs = new ArrayList<>();

        while (true){
            oomObjs.add(new OOMObj());
        }
    }
}
