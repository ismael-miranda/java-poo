package poo.aula09;

public class Livro  implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    private String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public boolean isAberto(){
        return this.aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("------- Informações do Livro ----");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.print("Total de Páginas: " + getTotPaginas());
        System.out.print(" - Página atual: " + getPagAtual());
        System.out.println(" - Aberto = " + isAberto());
        System.out.print("Leitor: " + getLeitor().getNome());
        System.out.print(", Idade: " + getLeitor().getIdade());
        System.out.print(", Sexo: " + getLeitor().getSexo());
    }
    @Override
    public void abrir(){
        setAberto(true);
    }

    @Override
    public void fechar(){
        setAberto(false);
    }

    @Override
    public void folhear(int pag){
        if(getTotPaginas() > pag){
            setPagAtual(0);
        }else{
            setPagAtual(pag);
        }
    }

    @Override
    public void avancarPag(){
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag(){
        setPagAtual(getPagAtual() - 1);
    }

}
