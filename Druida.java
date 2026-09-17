public class Druida extends Personaje implements Hechicero, Sanador 
{
    private int mana;
    private int poderCuracion;
    private String formaNatural;

    public Druida(String nombre, int nivel, int puntosVida, int mana, int poderCuracion, String formaNatural) 
    {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderCuracion = poderCuracion;
        this.formaNatural = formaNatural;
    }

    @Override
    public void atacar() 
    {
        System.out.println(nombre + " invoca fuerzas de la naturaleza.");
    }

    @Override
    public int calcularDanio() 
    {
        return nivel * 30 + mana / 2;
    }

    @Override
    public void lanzarHechizo() 
    {
        System.out.println(nombre + " lanza un hechizo de naturaleza. (Mana: " + mana + ")");
    }

    @Override
    public int getMana() 
    {
        return mana;
    }

    @Override
    public void curarAliado(Personaje aliado) 
    {
        aliado.puntosVida += poderCuracion;
        System.out.println(nombre + " cura a " + aliado.getNombre() + " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public int getPoderCuracion() 
    {
        return poderCuracion;
    }
}
