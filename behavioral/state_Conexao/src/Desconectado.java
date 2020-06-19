
public class Desconectado implements IConexaoState {

    public Desconectado() {
        System.out.println("Desconectado");
    }

    @Override
    public void Conectar(Conexao novaConexao) {
        novaConexao.setState(new Conectado());
    }

    @Override
    public void Desconectar(Conexao novaConexao) {
        
        System.out.println("Estado inválido, não pode desconectar pois já está desconectado.");
    }

    @Override
    public void EnviarRequisicao(Requisicao novaRequisicao, Conexao novaConexao) {
        
        System.out.println("Estado inválido, não pode enviar requisições pois está desconectado.");
    }

    @Override
    public void ReceberResposta(Conexao novaConexao) {
        System.out.println("Estado inválido, não pode receber resposta, pois não está conectado.");
    }
    
}
