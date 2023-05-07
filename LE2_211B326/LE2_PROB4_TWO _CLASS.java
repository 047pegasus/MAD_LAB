class Two extends One{ // this class won't compile properly if a proper constructor is not declared in this class as it own i.e., Two(int x, int y).
    int tw;
    Two(int x,int y){
        super(x); //calls base class constructor One(int x) method.
        tw=y;
    }
}