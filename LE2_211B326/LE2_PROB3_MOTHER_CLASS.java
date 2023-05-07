class Mother{
    int x;
    static void show(){ //only making this show() method static results in an error as this makes the show() method defined in child class obsolete & thus it should also be declared static
        System.out.println("Hello from Mother class show()");
    }
}