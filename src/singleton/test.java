package singleton;

import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;
import strategy.Robo.Comportamento;

public class test {
    /**
     * @param args
     */
    public static void main(String[]args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        ComportamentoDefensivo  defensivo = new ComportamentoDefensivo();
         ComportamentoNormal ComportamentoNormal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        Comportamento normal;
       
        robo.mover();
    }


}
