package core;

interface Nameable {
    void Set(String name);
    String Get();
}

public abstract class Name implements Nameable {
    private String name;

    public void Set(String name){
        this.name = name;
    };
    public String Get(){
      return this.name;
    };
    Name(){

    }
    Name(String name){
        Set(name);
    }

}







