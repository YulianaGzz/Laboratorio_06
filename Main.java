public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("=== RPG — Expansión: Nuevas Clases ===");

        // new Personaje("X", 1, 100); // ERROR, no se puede instanciar clase abstracta!!!

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, "Forma de oso");
        Nigromante nigromante = new Nigromante("Malachar", 6, 350, 220, 5);
        Bardo bardo = new Bardo("Finnian", 5, 150, 60, "Laud");

        Personaje[] equipo = { druida, nigromante, bardo };

        System.out.println("\n-- Ataques y dano --");
        for (Personaje p : equipo)
        {
            p.atacar();
            System.out.println("Dano: " + p.calcularDanio());
        }

        System.out.println("\n-- Hechizos y curacion --");
        for (Personaje p : equipo)
        {
            if (p instanceof Hechicero h) 
            {
                h.lanzarHechizo();
            }
            if (p instanceof Sanador s) 
            {
                s.curarAliado(nigromante);
            }
        }

        System.out.println("\n-- Estado final --");
        for (Personaje p : equipo)
        {
            System.out.println(p);
        }
    }
}