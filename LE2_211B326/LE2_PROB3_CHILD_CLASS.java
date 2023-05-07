class Child extends Mother{
    static void show(){ // this method is also declared static in order to make the polymorphism run-time (or dynamic) in nature 
        System.out.println("Hello from Child(::Mother) class show()");
    }
}
