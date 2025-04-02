package main.java;

class CorpoHumano
{
    public float massa;
    private  float altura;
    public float IMC;

    public void SetMassa(float massa)
    {
        this.massa = massa;
    }

    public void SetAltura(float altura)
    {
        this.altura = altura;
    }

    public void setIMC(float IMC){
        this.IMC = IMC;
    }
 
    public void calcularIMC(){
        IMC = massa/(altura*altura);
    }

    public float getIMC(){
        return this.IMC;
    }
}
