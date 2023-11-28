package dominio;

public abstract class Merito{

    protected String titulo;


    public void setTitulo(String titulo)

    {

        this.titulo = titulo;
    }

    public String  getTitulo(){

        return titulo;
    }

    public abstract float valorar();
}