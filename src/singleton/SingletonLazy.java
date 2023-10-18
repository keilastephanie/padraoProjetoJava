package singleton;

 

    /**
     *
     @author keila
     */ 
 public class SingletonLazy{

    private static SingletonLazy instancia = new SingletonLazy();
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia(){
      
        return instancia;
    }
 }