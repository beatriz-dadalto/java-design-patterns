
public class AguardandoResposta implements IConexaoState {
    
    public AguardandoResposta()
    {
        System.out.println("Aguardando resposta");
    }

    @Override
    public void Conectar(Conexao novaConexao) {
        
        System.out.println("Estado inválido, não pode conectar enquanto aguarda resposta.");
    }

    @Override
    public void Desconectar(Conexao novaConexao) {
        
        System.out.println("Estado inválido, não pode desconectar enquanto aguarda resposta.");
    }

    @Override
    public void EnviarRequisicao(Requisicao novaRequisicao, Conexao novaConexao) {
        System.out.println("Estado inválido, não pode enviar mais requisições enquanto aguarda resposta.");
    }

    @Override
    public void ReceberResposta(Conexao novaConexao) {
        System.out.println("Serviço respondido com sucesso...");
        novaConexao.setState(new Conectado());
    }
    
}
