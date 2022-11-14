package poo.aula14;

public class ProjetoVideos {
    public static void main(String[] args) {
        Video vi [] = new Video[3];
        Gafanhoto gaf[] = new Gafanhoto[4];


        vi[0] = new Video("Aula Java POO");
        vi[1] = new Video("Aula HTML/CSS");
        vi[2] = new Video("Aula Python");

        gaf[0] = new Gafanhoto("Gordon", 39, "M", "gd");
        gaf[1] = new Gafanhoto("Melinda", 19, "F", "meli");
        gaf[2] = new Gafanhoto("Ponesio", 23, "M", "nesio");
        gaf[3] = new Gafanhoto("Matilda", 43, "F", "mada");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(gaf[0], vi[0]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(gaf[0], vi[1]);
        vis[1].avaliar(40f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());

//        System.out.println(gaf[0].toString());
//        System.out.println(vi[0].toString());
//        System.out.println(vi[1].toString());
//        System.out.println(vi[2].toString());


    }
}
