/**
 * 单例模式（线程安全 + 懒加载）：静态内部类（Initialization-on-demand holder idiom）。
 */
public final class Singleton {

    // 私有构造器：防止外部 new
    private Singleton() {
        // 可在此做初始化
    }

    // 静态内部类：只有在第一次调用 getInstance() 时才会加载
    private static final class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    // 示例业务方法
    public void doSomething() {
        System.out.println("Singleton is working");
    }
}
