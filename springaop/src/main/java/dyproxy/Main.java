package dyproxy;

import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {
        Cal proxy = (Cal)CalProxy.getInstance(new CalImpl());
        proxy.add(1, 2);

    }
}
