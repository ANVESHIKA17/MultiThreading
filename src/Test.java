public class Test {
    public static void main(String[] args) {
        Thread obj= Thread.currentThread();
        obj.setName("anveshika");
        System.out.println(obj.isAlive());
      //  System.out.println(10/0);
        System.out.println(obj.getName());
        System.out.println(obj.isDaemon());
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getPriority());
        System.out.println(obj.getId());
        System.out.println(obj.getState());


    }
}
