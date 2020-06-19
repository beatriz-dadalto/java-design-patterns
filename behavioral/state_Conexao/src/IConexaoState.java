
public interface IConexaoState {
    
    void Conectar(Conexao novaConexao);
    void Desconectar(Conexao novaConexao);
    void EnviarRequisicao(Requisicao novaRequisicao, Conexao novaConexao);
    void ReceberResposta(Conexao novaConexao);
    
}
