public class Carro {
    int potencia;
    int velocidade;
    String nome;
    void acelerar(){
        velocidade += potencia;
    }
    void frear (){
        velocidade  = velocidade/2;
    }
    int getVelocidade(){
        return velocidade;
    }
    void imprimir(){
        System.out.print("O carro "+nome+ " esta a "+getVelocidade()+"km/h \n" );
    }

}
