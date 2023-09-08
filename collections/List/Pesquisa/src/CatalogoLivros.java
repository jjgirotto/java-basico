import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }
    // adicionar livro
    public void adicionarLivro(String titulo, String autor, int ano) {
        catalogo.add(new Livro(titulo, autor, ano));
    }

    //pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // pesquisa por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    // pesquisar por titulo
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    //main
    public static void main(String[] args) {
        CatalogoLivros catalogodelivros = new CatalogoLivros();

        catalogodelivros.adicionarLivro("java util", "tanenmbaum", 1980);
        catalogodelivros.adicionarLivro("java basico", "silbershcatz", 1999);
        catalogodelivros.adicionarLivro("java inter", "costa", 2000);

        System.out.println(catalogodelivros.pesquisarPorAutor("costa"));
        System.out.println(catalogodelivros.pesquisarPorIntervaloAnos(1990, 2001));
        System.out.println(catalogodelivros.pesquisarPorTitulo("java util"));
    }
}