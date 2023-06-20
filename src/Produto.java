public class Produto {
    //Atributos
    int codigo;
    String nome;
    double valor;

    //Construtor padrão
    Produto(){}
    //Sobregarga do metodo construtor
    Produto(int _codigo){
        this.codigo = _codigo;
    }

}
//mais uma sobregarga
Produto(int _codigo, String _nome){
    this.codigo = _codigo;
    this.nome = _nome
}