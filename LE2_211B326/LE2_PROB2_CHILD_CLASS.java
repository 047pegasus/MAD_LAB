class Child extends Mother{
    void show(){
        System.out.println("Hello from Child(::Mother) class show()"); //This show() gets called in child class when it is called from reference obj var ch from main()
    }
}